package com.example.kjbkjjn.badmatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pageChooseGame extends AppCompatActivity {

    Button game_countclick;
    Button game_choosebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_choose_game);

        game_countclick=(Button)findViewById(R.id.game_countclick);
        game_choosebutton=(Button)findViewById(R.id.game_choosebutton);

        game_countclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(pageChooseGame.this, pageCountClick1.class);
                startActivityForResult(i, 0);
            }
        });
        game_choosebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(pageChooseGame.this, page1.class);
                startActivityForResult(i, 0);
            }
        });


    }
}
