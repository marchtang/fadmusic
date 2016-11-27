package com.example.android.fadmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView albumcover=(ImageView)findViewById(R.id.imageView);
        albumcover.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view){
               Intent new_album=new Intent(MainActivity.this, new_album.class);
               startActivity(new_album);
           }
        }
        );
    }
}
