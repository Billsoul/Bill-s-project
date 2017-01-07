package com.example.kjbkjjn.badmatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pageHowToPlay extends AppCompatActivity {

    TextView howtoplay;
    Button gohome2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_how_to_play);

        howtoplay = (TextView)findViewById(R.id.textView);
        gohome2 = (Button)findViewById(R.id.gohome2);

        gohome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(pageHowToPlay.this,page1.class);
                startActivityForResult(i,0);
            }
        });
    }
}
