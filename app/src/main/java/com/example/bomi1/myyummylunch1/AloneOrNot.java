package com.example.bomi1.myyummylunch1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class AloneOrNot extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aloneornot);

        Button AloneButton = (Button) findViewById(R.id.AloneButton);
        Button TogetherButton = (Button) findViewById(R.id.TogetherButton);

        AloneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent aloneIntent=new Intent(AloneOrNot.this, recommendActivity.class);
                startActivity(aloneIntent);
                finish();
            }
        });
        TogetherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voteIntent = new Intent(AloneOrNot.this, voteActivity.class);
                startActivity(voteIntent);
                finish();
            }
        });}}
