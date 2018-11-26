package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class recommendActivity extends AppCompatActivity {
   static public ArrayList recentpl=new ArrayList();
    private String [][] array = new String [20][4];
    static public ArrayList str2=new ArrayList();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

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
        ArrayList arr2 =SettingActivity.conditionList2;
        ArrayList arr3=SettingActivity.conditionList3;

        String[] str = new String[20];

        int k=0;
        for(int i = 0; i < 20; i++){

              if(array[i][1].equals(arr.get(0))||array[i][1].equals(arr.get(1))||array[i][1].equals(arr.get(2))||array[i][1].equals(arr.get(3))||arr.get(0).equals("0")&&arr.get(1).equals("0")&&arr.get(2).equals("0")&&arr.get(3).equals("0")){
                    if(array[i][2].equals(arr2.get(0))||array[i][2].equals(arr2.get(1))||array[i][2].equals(arr2.get(2))||array[i][2].equals(arr2.get(3))||arr2.get(0).equals("0")&&arr2.get(1).equals("0")&&arr2.get(2).equals("0")&&arr2.get(3).equals("0")) {
                        if(array[i][3].equals(arr3.get(0))||array[i][3].equals(arr3.get(1))||array[i][3].equals(arr3.get(2))||arr3.get(0).equals("0")&&arr3.get(1).equals("0")&&arr3.get(2).equals("0")){
                         str[i] = array[i][0];
                         k++;//필터링된 항목 개수
                        }
                        else{
                            str[i]="000";
                        }
                    }
                    else{
                        str[i] = "000";
                    }
               }
               else{
                  str[i]="000";
              }

        }

        str2.clear();
        for(int i=0;i<20;i++){
            if(str[i]!="000"){
            str2.add(str[i]);
            }
        }


        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, str2);
        ListView listview = (ListView) findViewById(R.id.recomList);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ListView listview = (ListView) parent;
                String clickedplace = (String) listview.getItemAtPosition(position);
                recentpl.add(clickedplace);

                setContentView(R.layout.activity_placeinfo);
                TextView t1 = (TextView) findViewById(R.id.placename) ;
                t1.setText(clickedplace) ;
                Button back=(Button) findViewById(R.id.backbutton);
                Button ok=(Button) findViewById(R.id.okbutton);

                ok.setOnClickListener(new View.OnClickListener() {//음식점선택시

                    @Override
                    public void onClick(View view) {
                        Intent okIntent = new Intent(recommendActivity.this, FinalActivity.class);
                        startActivity(okIntent);
                        finish();
                    }
                });
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent backIntent = new Intent(recommendActivity.this, recommendActivity.class);
                        startActivity(backIntent);
                        finish();
                    }
                });

            }
        });



    }
}
