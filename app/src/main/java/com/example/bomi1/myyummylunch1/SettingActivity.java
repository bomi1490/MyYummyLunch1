package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;




public class SettingActivity extends AppCompatActivity{


    static public ArrayList conditionList=new ArrayList ();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        CheckBox check1_1 = (CheckBox) findViewById(R.id.check1_1);//한식
        CheckBox check1_2 = (CheckBox) findViewById(R.id.check1_2);//양식
       /* CheckBox check1_3 = (CheckBox) findViewById(R.id.check1_3);//중식
        /*CheckBox check1_4 = (CheckBox) findViewById(R.id.check1_4);//일식*/
        /*CheckBox check2_1 = (CheckBox) findViewById(R.id.check2_1);//개운사
        CheckBox check2_2 = (CheckBox) findViewById(R.id.check2_2);//참살이
        CheckBox check2_3 = (CheckBox) findViewById(R.id.check2_3);//오거리
        CheckBox check2_4 = (CheckBox) findViewById(R.id.check2_4);//문캠
        CheckBox check3_1 = (CheckBox) findViewById(R.id.check3_1);//저렴
        CheckBox check3_2 = (CheckBox) findViewById(R.id.check3_2);//무난
        CheckBox check3_3 = (CheckBox) findViewById(R.id.check3_3);//호화*/
        Button FinishSetButton = (Button) findViewById(R.id.FinishSetButton);

        conditionList.clear();
        conditionList.add("0");
        conditionList.add("0");
        conditionList.add("0");
        conditionList.add("0");
        check1_1.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList.set(0, "1");
                    Toast.makeText(getApplicationContext(), "check1", Toast.LENGTH_SHORT).show();
                }


            }
            });
        check1_2.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList.set(1,"2");
                    Toast.makeText(getApplicationContext(), "check2", Toast.LENGTH_SHORT).show();

                }


            }
        });
      /* check1_3.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList.add("3");
                    Toast.makeText(getApplicationContext(), "check3", Toast.LENGTH_SHORT).show();

                }
                else{
                    conditionList.add("0");
                }

            }
        });
        check1_4.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList.add("4");
                    Toast.makeText(getApplicationContext(), "check4", Toast.LENGTH_SHORT).show();
                }
                else{
                    conditionList.add("0");
                }

            }
        });*/


        //선택완료 버튼 누르면 다음 액티비티로 넘어가는 기능
        FinishSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RecomIntent = new Intent(SettingActivity.this, AloneOrNot.class);
                startActivity(RecomIntent);
                finish();
            }
        });





                }}










