package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SettingActivity extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        CheckBox check1_1 = (CheckBox) findViewById(R.id.check1_1);//한식
        CheckBox check1_2 = (CheckBox) findViewById(R.id.check1_2);//양식
        CheckBox check1_3 = (CheckBox) findViewById(R.id.check1_3);//중식
        CheckBox check1_4 = (CheckBox) findViewById(R.id.check1_4);//일식
        CheckBox check2_1 = (CheckBox) findViewById(R.id.check2_1);//개운사
        CheckBox check2_2 = (CheckBox) findViewById(R.id.check2_2);//참살이
        CheckBox check2_3 = (CheckBox) findViewById(R.id.check2_3);//오거리
        CheckBox check2_4 = (CheckBox) findViewById(R.id.check2_4);//문캠
        CheckBox check3_1 = (CheckBox) findViewById(R.id.check3_1);//저렴
        CheckBox check3_2 = (CheckBox) findViewById(R.id.check3_2);//무난
        CheckBox check3_3 = (CheckBox) findViewById(R.id.check3_3);//호화
        Button FinishSetButton = (Button) findViewById(R.id.FinishSetButton);



        //선택완료 버튼 누르면 다음 액티비티로 넘어가는 기능
        FinishSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RecomIntent = new Intent(SettingActivity.this, AloneOrNot.class);
                startActivity(RecomIntent);
                finish();
            }
        });

        class ReadCSV{
            public void main(String[]args){
                List<List<String>> ret=new ArrayList<List<String>>();
                BufferedReader br=null;
                try{
                    br=Files.newBufferedReader(Paths.get("test.csv"));
                    Charset.forName("UTF-8");
                    String line="";
                    while((line=br.readLine())!=null){
                        List<String>tmpList=new ArrayList<String>();
                        String array[]=line.split(",");
                        tmpList=Arrays.asList(array);
                        System.out.println(tmpList);
                        ret.add(tmpList);
                    }

                }catch(FileNotFoundException e){
                    e.printStackTrace();
                }catch (IOException e){
                    e.printStackTrace();
                }finally{
                    try{
                        if(br!=null){
                            br.close();
                        }
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }






    }}

