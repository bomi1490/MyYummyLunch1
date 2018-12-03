package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExplainPage extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);
        Button btn = (Button) findViewById(R.id.backB);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                finish();
            }
        });

        TextView t2 = (TextView) findViewById(R.id.textView7) ;
        t2.setText("<<< MY YUMMY LUNCH 이용방법 >>>\n\n\n"+"MY YUMMY LUNCH는 사용자가 원하는 조건의 식당을 정확하고 편리하게 추천해주는 프로그램입니다! \n\n" +
                "고려대학교 근처 어디에서 식사를 해야 할지 모르시겠다면?\n MY YUMMY LUNCH를 한번 이용해보세요!\n\n\n" +
                "#원하는 조건을 선택하세요. \n" +
                "복수선택이 가능하며, 각 항목별로 아무 선택도 하지 않으시면 ‘상관 없음’으로 간주됩니다!\n\n" +
                "#어떻게 결정할 것인지 선택하세요.\n" +
                "혼자 결정하기) 원하는 조건에 부합하는 식당에 대한 정보를 보고 직접 고를 수 있어요!\n" +
                "여럿이서 결정하기) 조건에 부합하는 식당들 리스트를 단체 카톡방에 내보내기 할 수 있어요!\n" +
                "랜덤으로 결정하기) 조건에 맞는 식당들 중 MY YUMMY LUNCH가 사용자를 위해 랜덤으로 선택해드립니다!\n") ;
}}
