package com.example.kjbkjjn.badmatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button gohome1;
    Button retry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        final int playernum=getIntent().getExtras().getInt("key1");

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        gohome1 = (Button)findViewById(R.id.gohome1);
        retry = (Button)findViewById(R.id.retry);
//----------------------------看數字顯示多少按鈕-------------------------------
        if(playernum==2){
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn6.setVisibility(View.INVISIBLE);
            btn7.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.INVISIBLE);
        }
        if(playernum==3){
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn6.setVisibility(View.INVISIBLE);
            btn7.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.INVISIBLE);
        }
        if(playernum==4){
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn7.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.INVISIBLE);
        }
        if(playernum==5){
            btn4.setVisibility(View.INVISIBLE);
            btn7.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.INVISIBLE);
        }
        if(playernum==6){
            btn4.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.INVISIBLE);
        }
        if(playernum==7){
            btn8.setVisibility(View.INVISIBLE);
        }
//----------------------------看數字顯示多少按鈕-------------------------------

//----------------------------按下不回彈-------------------------------
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setEnabled(false);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(false);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setEnabled(false);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setEnabled(false);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setEnabled(false);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setEnabled(false);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn7.setEnabled(false);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn8.setEnabled(false);
            }
        });
//----------------------------按下不回彈-------------------------------

        gohome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(page2.this,page1.class);
                startActivityForResult(i,0);
            }
        });


    }
}
