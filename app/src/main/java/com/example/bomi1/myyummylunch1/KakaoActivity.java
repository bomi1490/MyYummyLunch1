package com.example.bomi1.myyummylunch1;

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
        try{
            kakaoLink=KakaoLink.getKakaoLink(KakaoActivity.this);
        } catch(KakaoParameterException e){
            e.printStackTrace();
        }


        Button KButton = (Button) findViewById(R.id.kakaoB);

        KButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String s="안녕";
                final KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder=kakaoLink.createKakaoTalkLinkMessageBuilder();

                try{
                    kakaoLink.sendMessage(kakaoTalkLinkMessageBuilder, ctx);
                } catch(KakaoParameterException e){
                    e.printStackTrace();
                }

            }
        });


}}
