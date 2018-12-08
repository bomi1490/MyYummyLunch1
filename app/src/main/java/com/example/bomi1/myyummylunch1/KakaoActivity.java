package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Context;

import com.kakao.kakaolink.KakaoLink;
import com.kakao.kakaolink.KakaoTalkLinkMessageBuilder;
import com.kakao.util.KakaoParameterException;

public class KakaoActivity extends AppCompatActivity {
   public KakaoLink kakaoLink;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Context ctx = this;
        setContentView(R.layout.activity_kakao);



        Button KButton = (Button) findViewById(R.id.kakaoB);

        KButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String linkstring=" ";
                for(String name: AloneOrNot.str2){
                    linkstring+="/";
                    linkstring+=name;
                }
                System.out.println(linkstring);
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"MY YUMMY LUNCH 추천 메뉴");

                intent.putExtra(Intent.EXTRA_TEXT,linkstring);
                Intent chooser=Intent.createChooser(intent,"공유하기");
                startActivity(chooser);

            }
        });




}}
