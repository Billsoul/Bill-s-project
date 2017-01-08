package com.example.kjbkjjn.badmatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        minusbtn.setBackgroundResource(R.drawable.minus2); //初始值在2，所以APP一開始我先把減號變色了


        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num == 8){
                    num = 8;
                    displayNum = String.valueOf(num);
                    playerNum.setText(displayNum);
                }
                else{
                    num = num + 1;
                    displayNum = String.valueOf(num);
                    playerNum.setText(displayNum);
                    if(num == 8)
                        plusbtn.setBackgroundResource(R.drawable.plus2);
                    else
                        minusbtn.setBackgroundResource(R.drawable.minus);
                }
            }
        });

        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num == 2){
                    num = 2;
                    displayNum = String.valueOf(num);
                    playerNum.setText(displayNum);

                }
                else{
                    num = num - 1;
                    displayNum = String.valueOf(num);
                    playerNum.setText(displayNum);
                    if(num == 2)
                        minusbtn.setBackgroundResource(R.drawable.minus2);
                    else
                        plusbtn.setBackgroundResource(R.drawable.plus);

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
                i.setClass(page1.this, pageChooseGame.class);
                startActivityForResult(i, 0);
            }
        });




    }
}
