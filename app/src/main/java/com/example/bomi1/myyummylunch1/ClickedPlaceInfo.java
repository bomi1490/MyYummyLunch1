package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class ClickedPlaceInfo extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeinfo);
        TextView t1 = (TextView) findViewById(R.id.placename) ;
        t1.setText(recommendActivity.clickedplace) ;
        TextView t2 = (TextView) findViewById(R.id.foodtype) ;
        t2.setText(AloneOrNot.array[recommendActivity.exactplacenum][1]) ;
        TextView t3 = (TextView) findViewById(R.id.placelocation) ;
        if(AloneOrNot.array[recommendActivity.exactplacenum][2].equals("A"))
        t3.setText("개운사/정후") ;
        else if(AloneOrNot.array[recommendActivity.exactplacenum][2].equals("B"))
            t3.setText("참살이") ;
        else if(AloneOrNot.array[recommendActivity.exactplacenum][2].equals("C"))
            t3.setText("오거리") ;
        else if(AloneOrNot.array[recommendActivity.exactplacenum][2].equals("D"))
            t3.setText("문과캠") ;
        TextView t4 = (TextView) findViewById(R.id.foodprice) ;
        t4.setText(AloneOrNot.array[recommendActivity.exactplacenum][3]) ;
        TextView t5 = (TextView) findViewById(R.id.menuinfo) ;
        t5.setText(AloneOrNot.array[recommendActivity.exactplacenum][4]) ;

        Button back=(Button) findViewById(R.id.backbutton);
        Button ok=(Button) findViewById(R.id.okbutton);

        ok.setOnClickListener(new View.OnClickListener() {//음식점선택시

            @Override
            public void onClick(View view) {

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
