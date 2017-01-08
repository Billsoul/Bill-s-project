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

import org.w3c.dom.Text;

public class pageCountClick1 extends AppCompatActivity {

    Button clickbtn1;
    TextView timeview1;
    TextView numclickedview1;
    int numclicked1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_count_click1);

        clickbtn1=(Button)findViewById(R.id.player1btn);
        timeview1=(TextView)findViewById(R.id.currenttime1);
        numclickedview1=(TextView)findViewById(R.id.numberclicked1);

        AlertDialog.Builder dialog = new AlertDialog.Builder(pageCountClick1.this);
        dialog.setTitle("player1");
        dialog.setMessage("這是一個按越多下就贏的遊戲,按下OK馬上開始");

        dialog.setNeutralButton("返回",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent j=new Intent();
                j.setClass(pageCountClick1.this,pageChooseGame.class);
                startActivityForResult(j, 0);
            }
        });
        dialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                new CountDownTimer(10000, 10) {

                    public void onTick(long millisUntilFinished) {
                        timeview1.setText("Time: " + String.valueOf((double) millisUntilFinished/1000));
                    }

                    public void onFinish() {
                        timeview1.setText("Finish!");
                        clickbtn1.setEnabled(false);
                    }
                }.start();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        final Intent finishIntent = new Intent(pageCountClick1.this, pageCountClick2.class);
                        finishIntent.putExtra("key",numclicked1);
                        pageCountClick1.this.startActivity(finishIntent);
                        pageCountClick1.this.finish();
                    }
                }, 10600);
            }
        });
        dialog.show();

        clickbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numclicked1++;
                numclickedview1.setText("Clicked: "+String.valueOf(numclicked1));
            }
        });




    }
}
