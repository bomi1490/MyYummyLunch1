package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Button exitButton = (Button) findViewById(R.id.exitButton);
        int size=recommendActivity.recentpl.size();
        String string= (String) recommendActivity.recentpl.get(size-1);
        TextView t1 = (TextView) findViewById(R.id.place) ;
        t1.setText(string) ;

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exit2Intent = new Intent(FinalActivity.this, ExitPage.class);
                startActivity(exit2Intent);

            }
        });
    }

}