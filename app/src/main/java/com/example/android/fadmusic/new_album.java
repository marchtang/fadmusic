package com.example.android.fadmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class new_album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_album2);
        TextView song_name=(TextView)findViewById(R.id.textView2);
        ImageView play=(ImageView)findViewById(R.id.imageView4) ;
        ImageButton back=(ImageButton)findViewById(R.id.back_button) ;
        song_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play_song=new Intent(new_album.this,play_song.class);
                startActivity(play_song);
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play_song=new Intent(new_album.this,play_song.class);
                startActivity(play_song);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main=new Intent(new_album.this,MainActivity.class);
                startActivity(main);
            }
        });
    }
}
