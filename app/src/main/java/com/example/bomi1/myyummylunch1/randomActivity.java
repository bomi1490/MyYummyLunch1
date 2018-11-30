package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class randomActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        int listsize=recommendActivity.str2.size();//리스트가 10개면 10
        int randomnum= (int) (Math.random() * listsize);//0~10 출력
        int exactplacenumber=0;
        for(int i=0;i<20;i++){
            if(recommendActivity.array[i][0].equals(recommendActivity.str2.get(randomnum))){
                exactplacenumber=i;
                break;
            }
        }

        TextView textview=(TextView)findViewById(R.id.place);
        textview.setText(recommendActivity.array[exactplacenumber][0]);
       recommendActivity.recentpl.add(recommendActivity.array[exactplacenumber][0]);

        Button exitButton = (Button) findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exit2Intent = new Intent(randomActivity.this, ExitPage.class);
                startActivity(exit2Intent);

            }
        });


}}
