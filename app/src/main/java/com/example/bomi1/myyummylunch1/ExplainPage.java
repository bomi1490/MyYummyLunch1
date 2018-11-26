package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExplainPage extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);
        Button btn = (Button) findViewById(R.id.backB);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backIntent=new Intent(ExplainPage.this, MainActivity.class);
                startActivity(backIntent);
                finish();
            }
        });

        TextView t2 = (TextView) findViewById(R.id.textView7) ;
        t2.setText("<<< MY YUMMY LUNCH 이용방법 >>>") ;
}}
