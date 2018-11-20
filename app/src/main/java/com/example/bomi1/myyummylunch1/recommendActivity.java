package com.example.bomi1.myyummylunch1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class recommendActivity extends AppCompatActivity{

    private String [][] array = new String [20][4];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);


    /*Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent finalIntent = new Intent(recommendActivity.this, FinalActivity.class);
            startActivity(finalIntent);
            finish();
        }
    });*/



        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("text.csv")));

            String line = "";
            String temp[] = new String[4];
            int i = 0;

            while((line = reader.readLine()) != null){
                temp = line.split(",");
                    array[i][0] = temp[0];
                    array[i][1] = temp[1];
                    array[i][2] = temp[2];
                    array[i][3] = temp[3];
                    i++;
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
        }catch (IOException e){
            e.printStackTrace();
        }


        ArrayList arr = SettingActivity.conditionList;

        String[] str = new String[20];

        int k=0;
        for(int i = 0; i < 20; i++){

                if(array[i][1].equals(arr.get(0)))
                {
                    str[i] = array[i][0];
                    k++;//필터링된 항목 개수
                }
                else if (array[i][1].equals(arr.get(1))){
                    str[i] = array[i][0];
                    k++;
                }

              /* else if(array[i][1].equals((arr.get(2)))){
                    str[i]=array[i][0];
                    k++;
                }*/
                /*else if(array[i][1].equals((arr.get(3)))){
                    str[i]=array[i][0];
                    k++;
                }*/
                else
                {
                    str[i]="000";
                }

        }
        String[]str2=new String[k];
        int m=0;
        for(int i=0;i<20;i++){
            if(!(str[i].equals("000"))){
            str2[m]=str[i];
            m++;}
        }

        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, str2);
        ListView listview = (ListView) findViewById(R.id.recomList);
        listview.setAdapter(adapter);

    }
}
