package com.example.kjbkjjn.badmatch;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

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

    int randomnum2,randomnum3,randomnum4,randomnum5,randomnum6,randomnum7,randomnum8;

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

            randomnum2 = (int)(Math.random()*2)+1;
            if(randomnum2 == 1){
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showToast();
                        btn1.setEnabled(false);
                        btn5.setEnabled(false);
                    }
                });
                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btn5.setEnabled(false);
                    }
                });
            }
            else{
                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showToast();
                        btn5.setEnabled(false);
                        btn1.setEnabled(false);
                    }
                });
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btn1.setEnabled(false);
                    }
                });
            }
        }
        else if(playernum==3){
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn6.setVisibility(View.INVISIBLE);
            btn7.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.INVISIBLE);

            randomnum3 = (int)(Math.random()*3)+1;
            switch (randomnum3){
                case 1:
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn5.setEnabled(false);
                        }
                    });
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn2.setEnabled(false);
                        }
                    });
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn5.setEnabled(false);
                        }
                    });
                break;
                case 2:
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn5.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn5.setEnabled(false);
                        }
                    });
                break;
                case 3:
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn5.setEnabled(false);
                        }
                    });
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
                break;
            }
        }
        else if(playernum==4){
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn7.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.INVISIBLE);

            randomnum4 = (int)(Math.random()*4)+1;
            switch (randomnum4){
                case 1:
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                        }
                    });
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn2.setEnabled(false);
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
                    break;
                case 2:
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 3:
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                        }
                    });
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
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn6.setEnabled(false);
                        }
                    });
                    break;
                case 4:
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                        }
                    });
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
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn5.setEnabled(false);
                        }
                    });
                    break;
            }
        }
        else if(playernum==5){
            btn4.setVisibility(View.INVISIBLE);
            btn7.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.INVISIBLE);

            randomnum5 = (int)(Math.random()*5)+1;
            switch (randomnum5) {
                case 1:
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
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
                    break;
                case 2:
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn3.setEnabled(false);
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
                    break;
                case 3:
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                        }
                    });
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn2.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 4:
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn6.setEnabled(false);
                        }
                    });
                    break;
                case 5:
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
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
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn5.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    break;
            }
        }
        else if(playernum==6){
            btn4.setVisibility(View.INVISIBLE);
            btn8.setVisibility(View.INVISIBLE);

            randomnum6 = (int)(Math.random()*6)+1;
            switch (randomnum6) {
                case 1:
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
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
                    break;
                case 2:
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn3.setEnabled(false);
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
                    break;
                case 3:
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                        }
                    });
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn2.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 4:
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 5:
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
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
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn5.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn7.setEnabled(false);
                        }
                    });
                    break;
                case 6:
                    btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    break;
            }
        }
        else if(playernum==7){
            btn8.setVisibility(View.INVISIBLE);

            randomnum7 = (int)(Math.random()*7)+1;
            switch (randomnum7) {
                case 1:
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
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
                    break;
                case 2:
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 3:
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                        }
                    });
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn2.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 4:
                    btn4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 5:
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 6:
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn7.setEnabled(false);
                        }
                    });
                    break;
                case 7:
                    btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    break;
            }
        }
        else if(playernum==8) {
            randomnum8 = (int) (Math.random() * 8) + 1;
            switch (randomnum8) {
                case 1:
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                            btn8.setEnabled(false);
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
                    break;
                case 2:
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                            btn8.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 3:
                    btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                            btn8.setEnabled(false);
                        }
                    });
                    btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn2.setEnabled(false);
                        }
                    });
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 4:
                    btn4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                            btn8.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 5:
                    btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                            btn8.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 6:
                    btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                            btn8.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
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
                    break;
                case 7:
                    btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                            btn8.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    btn8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn8.setEnabled(false);
                        }
                    });
                    break;
                case 8:
                    btn8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            showToast();
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                            btn8.setEnabled(false);
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
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            btn1.setEnabled(false);
                        }
                    });
                    break;
            }
        }


//----------------------------重設遊戲---------------------------------
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);*/
                finish();
                startActivity(getIntent());

            }
        });
//----------------------------重設遊戲---------------------------------

        gohome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(page2.this,page1.class);
                startActivityForResult(i,0);
            }
        });


    }
    private void showToast(){
        Toast toast = new Toast(page2.this);
        toast.setGravity(Gravity.CENTER,0,300);
        toast.setDuration(Toast.LENGTH_SHORT);
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_custom_toast,(ViewGroup) findViewById(R.id.custom_toast_root));
        toast.setView(layout);
        toast.show();
    }

}
