package com.example.kjbkjjn.badmatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page1 extends AppCompatActivity {

    Button startbtn;
    Button howtoplay;
    Button plusbtn;
    Button minusbtn;
    TextView playerNum;
    public int num=2;
    String displayNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        startbtn=(Button)findViewById(R.id.StartButton);
        plusbtn=(Button)findViewById(R.id.plusButton);
        minusbtn=(Button)findViewById(R.id.minusButton);
        howtoplay=(Button)findViewById(R.id.HowToPlayButton);
        playerNum=(TextView)findViewById(R.id.playernum);


            plusbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    minusbtn.setEnabled(true);
                    playerNum.setText(String.valueOf(++num));
                    if(num>=8)
                    {
                        plusbtn.setEnabled(false);
                    }
                }
            });

            minusbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    plusbtn.setEnabled(true);
                    playerNum.setText(String.valueOf(--num));
                    if(num<=2)
                    {
                        minusbtn.setEnabled(false);
                    }
                }
            });


        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(page1.this, page2.class);
                i.putExtra("key1",num);
                startActivityForResult(i, 0);
            }
        });


        howtoplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(page1.this, pageHowToPlay.class);
                startActivityForResult(i, 0);
            }
        });


    }
}
