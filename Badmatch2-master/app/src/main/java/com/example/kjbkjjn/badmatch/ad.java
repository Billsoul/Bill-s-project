package com.example.kjbkjjn.badmatch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

public class ad extends AppCompatActivity {
    VideoView videoView;
    ImageButton x ;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ad);
        videoView = (VideoView)findViewById(R.id.videoView);
        x = (ImageButton)findViewById(R.id.imageButton);
        button = (Button) findViewById(R.id.button);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.produce_0));
        videoView.requestFocus();
        videoView.start();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.pause();
                Uri uri=Uri.parse("https://www.facebook.com/events/230036317430618/241657696268480/?notif_t=plan_mall_activity&notif_id=1483166123908100");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(ad.this, pageChooseGame.class);
                startActivityForResult(i, 0);
            }
        });
    }
}
