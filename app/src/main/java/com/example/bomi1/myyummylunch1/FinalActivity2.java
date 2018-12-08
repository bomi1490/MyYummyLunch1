package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.bomi1.myyummylunch1.randomActivity.exactplacenumber;

public class FinalActivity2 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Button exitButton = (Button) findViewById(R.id.exitButton);


        TextView t1 = (TextView) findViewById(R.id.place) ;
        t1.setText(AloneOrNot.array[exactplacenumber][0]) ;

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exit2Intent = new Intent(FinalActivity2.this, ExitPage.class);
                startActivity(exit2Intent);

            }
        });
    }

}