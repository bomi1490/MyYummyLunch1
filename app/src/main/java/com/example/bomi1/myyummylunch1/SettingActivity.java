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
    static public ArrayList conditionList2=new ArrayList();
    static public ArrayList conditionList3=new ArrayList();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        CheckBox check1_1 = (CheckBox) findViewById(R.id.check1_1);//한식
        CheckBox check1_2 = (CheckBox) findViewById(R.id.check1_2);//양식
        CheckBox check1_3 = (CheckBox) findViewById(R.id.check1_3);//중식
        CheckBox check1_4 = (CheckBox) findViewById(R.id.check1_4);//일식*/
        CheckBox check2_1 = (CheckBox) findViewById(R.id.check2_1);//개운사
        CheckBox check2_2 = (CheckBox) findViewById(R.id.check2_2);//참살이
        CheckBox check2_3 = (CheckBox) findViewById(R.id.check2_3);//오거리
        CheckBox check2_4 = (CheckBox) findViewById(R.id.check2_4);//문캠
        CheckBox check3_1 = (CheckBox) findViewById(R.id.check3_1);//저렴
        CheckBox check3_2 = (CheckBox) findViewById(R.id.check3_2);//무난
        CheckBox check3_3 = (CheckBox) findViewById(R.id.check3_3);//호화
        CheckBox recentcheck=(CheckBox) findViewById(R.id.recentplCheckBox);//최근방문지제외

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
                }


            }
            });
        check1_2.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList.set(1,"2");


                }


            }
        });
      check1_3.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList.set(2,"3");


                }


            }
        });
        check1_4.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList.set(3,"4");

                }


            }
        });

        conditionList2.clear();
        conditionList2.add("0");
        conditionList2.add("0");
        conditionList2.add("0");
        conditionList2.add("0");

        check2_1.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList2.set(0, "5");

                }


            }
        });
        check2_2.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList2.set(1,"6");


                }


            }
        });
        check2_3.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList2.set(2,"7");


                }


            }
        });
        check2_4.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList2.set(3,"8");

                }


            }
        });

        conditionList3.clear();
        conditionList3.add("0");
        conditionList3.add("0");
        conditionList3.add("0");

        check3_1.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList3.set(0, "9");
                }


            }
        });
        check3_2.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList3.set(1,"10");


                }


            }
        });
        check3_3.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {conditionList3.set(2,"11");


                }


            }
        });

        recentcheck.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                {
                    //최근 방문지 제외 TO DO

                }


            }
        });

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










