package com.example.kjbkjjn.badmatch;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pageCountClick2 extends AppCompatActivity {

    Button clickbtn2;
    TextView timeview2;
    TextView numclickedview2;
    int numclicked2=0;
    int numclicked1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_count_click2);

        clickbtn2=(Button)findViewById(R.id.player2btn);
        timeview2=(TextView)findViewById(R.id.currenttime2);
        numclickedview2=(TextView)findViewById(R.id.numberclicked2);
        numclicked1=getIntent().getExtras().getInt("key");

        AlertDialog.Builder dialog = new AlertDialog.Builder(pageCountClick2.this);
        dialog.setTitle("player2");
        dialog.setMessage("這是一個按越多下就贏的遊戲,按下OK馬上開始");

        dialog.setNeutralButton("返回",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent j=new Intent();
                j.setClass(pageCountClick2.this,pageChooseGame.class);
                startActivityForResult(j, 0);
            }
        });
        dialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                new CountDownTimer(10000, 10) {

                    public void onTick(long millisUntilFinished) {
                        timeview2.setText("Time: " + String.valueOf((double) millisUntilFinished/1000));
                    }

                    public void onFinish() {
                        timeview2.setText("Finish!");
                        clickbtn2.setEnabled(false);
                    }
                }.start();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(numclicked1>numclicked2){
                            AlertDialog.Builder consult1 = new AlertDialog.Builder(pageCountClick2.this);
                            consult1.setTitle("對戰結果");
                            consult1.setMessage("Player1 贏啦～");
                            consult1.setPositiveButton("回首頁",new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent j=new Intent();
                                    j.setClass(pageCountClick2.this,pageChooseGame.class);
                                    startActivityForResult(j, 0);
                                }
                            });
                            consult1.setNeutralButton("再玩一次",new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent j=new Intent();
                                    j.setClass(pageCountClick2.this,pageCountClick1.class);
                                    startActivityForResult(j, 0);
                                }
                            });consult1.show();
                        }
                        if(numclicked1<numclicked2){
                            AlertDialog.Builder consult2 = new AlertDialog.Builder(pageCountClick2.this);
                            consult2.setTitle("對戰結果");
                            consult2.setMessage("Player2 贏啦～");
                            consult2.setPositiveButton("回首頁",new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent j=new Intent();
                                    j.setClass(pageCountClick2.this,pageChooseGame.class);
                                    startActivityForResult(j, 0);
                                }
                            });
                            consult2.setNeutralButton("再玩一次",new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent j=new Intent();
                                    j.setClass(pageCountClick2.this,pageCountClick1.class);
                                    startActivityForResult(j, 0);
                                }
                            });consult2.show();
                        }
                        if(numclicked1==numclicked2){
                            AlertDialog.Builder consult3 = new AlertDialog.Builder(pageCountClick2.this);
                            consult3.setTitle("對戰結果");
                            consult3.setMessage("和局收場");
                            consult3.setPositiveButton("回首頁",new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent j=new Intent();
                                    j.setClass(pageCountClick2.this,pageChooseGame.class);
                                    startActivityForResult(j, 0);
                                }
                            });
                            consult3.setNeutralButton("再玩一次",new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent j=new Intent();
                                    j.setClass(pageCountClick2.this,pageCountClick1.class);
                                    startActivityForResult(j, 0);
                                }
                            });consult3.show();
                        }
                    }
                }, 10600);
            }
        });
        dialog.show();

        clickbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numclicked2++;
                numclickedview2.setText("Clicked: "+String.valueOf(numclicked2));
            }
        });




    }
}
