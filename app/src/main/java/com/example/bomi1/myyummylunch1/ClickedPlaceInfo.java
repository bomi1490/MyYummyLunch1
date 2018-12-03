package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.bomi1.myyummylunch1.AloneOrNot.recentpl;

public class ClickedPlaceInfo extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeinfo);
        TextView t1 = (TextView) findViewById(R.id.placename) ;
        t1.setText(recommendActivity.clickedplace) ;
        TextView t2 = (TextView) findViewById(R.id.foodtype) ;
        t2.setText(AloneOrNot.array[recommendActivity.exactplacenum][1]) ;
        TextView t3 = (TextView) findViewById(R.id.placelocation) ;
        t3.setText(AloneOrNot.array[recommendActivity.exactplacenum][2]) ;
        TextView t4 = (TextView) findViewById(R.id.foodprice) ;
        t4.setText(AloneOrNot.array[recommendActivity.exactplacenum][3]) ;
        TextView t5 = (TextView) findViewById(R.id.menuinfo) ;
        t5.setText(recommendActivity.clickedplace) ;

        Button back=(Button) findViewById(R.id.backbutton);
        Button ok=(Button) findViewById(R.id.okbutton);

        ok.setOnClickListener(new View.OnClickListener() {//음식점선택시

            @Override
            public void onClick(View view) {
                recentpl.add(recommendActivity.clickedplace);
                Intent okIntent = new Intent(ClickedPlaceInfo.this, FinalActivity.class);
                startActivity(okIntent);

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(ClickedPlaceInfo.this, recommendActivity.class);
                startActivity(backIntent);
                finish();

            }
        });
}}
