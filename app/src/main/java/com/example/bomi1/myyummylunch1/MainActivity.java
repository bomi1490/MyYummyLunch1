package com.example.bomi1.myyummylunch1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button StartButton = (Button) findViewById(R.id.StartButton);
        Button ExitButton = (Button) findViewById(R.id.ExitButton);
        Button ExplainButton = (Button) findViewById(R.id.ExplainButton);

        StartButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent startIntent=new Intent(MainActivity.this, SettingActivity.class);
                startActivity(startIntent);

            }
        });
        ExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exitIntent = new Intent(MainActivity.this, ExitPage.class);
                startActivity(exitIntent);

            }
        });
        ExplainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explainIntent = new Intent(MainActivity.this, ExplainPage.class);
                startActivity(explainIntent);

            }
        });


    }}
