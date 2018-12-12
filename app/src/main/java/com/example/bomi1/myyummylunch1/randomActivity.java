package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.*;


public class randomActivity extends AppCompatActivity {
    static public int exactplacenumber;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        int listsize=AloneOrNot.str2.size();//리스트가 10개면 10
        int randomnum= (int) (Math.random() * listsize);//0~9 출력
        exactplacenumber=0;
        for(int i=0;i<AloneOrNot.NUMBER;i++){
            if(AloneOrNot.array[i][0].equals(AloneOrNot.str2.get(randomnum))){
                exactplacenumber=i;
                break;
            }
        }




        TextView textview=(TextView)findViewById(R.id.randomplace);
        textview.setText(AloneOrNot.array[exactplacenumber][0]);

        TextView type=(TextView)findViewById(R.id.typetype);
        type.setText(AloneOrNot.array[exactplacenumber][1]);

        TextView locate=(TextView)findViewById(R.id.locatelocate);
        if (AloneOrNot.array[exactplacenumber][2].equals("A")){
            locate.setText("개운사/정후");
        }
        if (AloneOrNot.array[exactplacenumber][2].equals("B")){
            locate.setText("참살이");
        }
        if (AloneOrNot.array[exactplacenumber][2].equals("C")){
            locate.setText("오거리");
        }
        if (AloneOrNot.array[exactplacenumber][2].equals("D")){
            locate.setText("문캠");
        }



        TextView price=(TextView)findViewById(R.id.priceprice);
        price.setText(AloneOrNot.array[exactplacenumber][3]);


        Button againButton = (Button) findViewById(R.id.AgainButton);
       againButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent againIntent = new Intent(randomActivity.this, randomActivity.class);
                startActivity(againIntent);
                finish();

            }
        });
        Button okButton = (Button) findViewById(R.id.OKButton);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent exit2Intent = new Intent(randomActivity.this, FinalActivity2.class);
                startActivity(exit2Intent);

            }
        });


}}
