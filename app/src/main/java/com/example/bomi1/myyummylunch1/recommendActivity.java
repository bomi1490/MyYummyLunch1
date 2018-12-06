package com.example.bomi1.myyummylunch1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class recommendActivity extends AppCompatActivity {

    static public String clickedplace;
    static int exactplacenum;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);


        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, AloneOrNot.str2);
        ListView listview = (ListView) findViewById(R.id.recomList);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ListView listview = (ListView) parent;
                clickedplace = (String) listview.getItemAtPosition(position);
                exactplacenum=0;
                for(int i=0;i<AloneOrNot.NUMBER;i++){
                    if(AloneOrNot.array[i][0].equals(clickedplace)){
                        exactplacenum=i;
                        break;
                    }
                }

                Intent clickedIntent = new Intent(recommendActivity.this, ClickedPlaceInfo.class);

                startActivity(clickedIntent);
                finish();




            }
        });



    }
}
