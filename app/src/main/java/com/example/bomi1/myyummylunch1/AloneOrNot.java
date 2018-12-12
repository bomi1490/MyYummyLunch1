package com.example.bomi1.myyummylunch1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class AloneOrNot extends AppCompatActivity {


    static public ArrayList<String> str2=new ArrayList<>();
    static int NUMBER;
    private int number;
    public static String[][] array;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aloneornot);








        try{//항목개수세기
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("text.csv")));

           NUMBER=0;
            while(( reader.readLine()) != null){
                NUMBER++;
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
        }catch (IOException e){
            e.printStackTrace();
        }
        array=new String[NUMBER][5];
        try{//읽어서배열에 저장
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(getAssets().open("text.csv")));
            String line = "";
            String temp[] = new String[5];
            number=0;
            while((line = reader2.readLine()) != null){
                temp = line.split(",");
                array[number][0] = temp[0];
                array[number][1] = temp[1];
                array[number][2] = temp[2];
                array[number][3] = temp[3];
                array[number][4]=temp[4];
                number++;
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
        }catch (IOException e){
            e.printStackTrace();
        }

        ArrayList arr = SettingActivity.conditionList_1;
        ArrayList arr2 =SettingActivity.conditionList_2;
        ArrayList arr3=SettingActivity.conditionList_3;

        String[] str = new String[NUMBER];


        for(int i = 0; i < NUMBER; i++){

            if(array[i][1].equals(arr.get(0))||array[i][1].equals(arr.get(1))||array[i][1].equals(arr.get(2))||array[i][1].equals(arr.get(3))||arr.get(0).equals("0")&&arr.get(1).equals("0")&&arr.get(2).equals("0")&&arr.get(3).equals("0")){
                if(array[i][2].equals(arr2.get(0))||array[i][2].equals(arr2.get(1))||array[i][2].equals(arr2.get(2))||array[i][2].equals(arr2.get(3))||arr2.get(0).equals("0")&&arr2.get(1).equals("0")&&arr2.get(2).equals("0")&&arr2.get(3).equals("0")) {
                    if(array[i][3].equals(arr3.get(0))||array[i][3].equals(arr3.get(1))||array[i][3].equals(arr3.get(2))||arr3.get(0).equals("0")&&arr3.get(1).equals("0")&&arr3.get(2).equals("0")){

                        str[i] = array[i][0];


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
        for(int i=0;i<NUMBER;i++){
            if(str[i]!="000"){
                str2.add(str[i]);
            }
        }


        Button AloneButton = findViewById(R.id.AloneButton);
        Button TogetherButton = findViewById(R.id.TogetherButton);
        Button RandomButton= findViewById(R.id.randombutton);
        AloneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent aloneIntent=new Intent(AloneOrNot.this, recommendActivity.class);
                startActivity(aloneIntent);

            }
        });
        TogetherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voteIntent = new Intent(AloneOrNot.this, KakaoActivity.class);
                startActivity(voteIntent);

            }
        });
       RandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent randomIntent = new Intent(AloneOrNot.this, randomActivity.class);
                startActivity(randomIntent);

            }
        });



    }
}


