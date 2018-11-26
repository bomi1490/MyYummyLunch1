package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.String;
import org.w3c.dom.Text;

import java.lang.String;
import java.util.ArrayList;

public class randomActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Button exitButton = (Button) findViewById(R.id.exitButton);
        TextView textview=(TextView)findViewById(R.id.place);
       /* recommendActivity r=new recommendActivity();
        int listsize=r.str2.size();
        int randomnum= (int) (Math.random() * listsize);
        ArrayList place=new ArrayList();
        place.add(r.str2.get(randomnum));*/



        textview.setText("place");
       // r.recentpl.add(r.str2.get(randomnum));
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exit2Intent = new Intent(randomActivity.this, ExitPage.class);
                startActivity(exit2Intent);
                finish();
            }
        });


}}
