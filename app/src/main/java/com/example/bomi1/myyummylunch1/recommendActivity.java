package com.example.bomi1.myyummylunch1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



public class recommendActivity extends AppCompatActivity{

    private String [][] array = new String [12][4];

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

       // final String [] array2 = {"1", "2", "3"};

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

        //conditionListMaker b=new conditionListMaker();
        String[] str = new String[12];
        for(int i = 0; i < 12; i++){

                if(array[i][1]=="1")
                {str[i] = array[i][0];}


        }

        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, str);
        ListView listview = (ListView) findViewById(R.id.recomList);
        listview.setAdapter(adapter);



    }
}
