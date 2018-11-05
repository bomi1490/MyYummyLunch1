package com.example.bomi1.myyummylunch1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class SettingActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Button check1_1 = (Button) findViewById(R.id.check1_1);
        Button check1_2 = (Button) findViewById(R.id.check1_2);
        Button check1_3 = (Button) findViewById(R.id.check1_3);
        Button check1_4 = (Button) findViewById(R.id.check1_4);
        Button check2_1 = (Button) findViewById(R.id.check2_1);
        Button check2_2 = (Button) findViewById(R.id.check2_2);
        Button check2_3 = (Button) findViewById(R.id.check2_3);
        Button check2_4 = (Button) findViewById(R.id.check2_4);
        Button check3_1 = (Button) findViewById(R.id.check3_1);
        Button check3_2 = (Button) findViewById(R.id.check3_2);
    }
}