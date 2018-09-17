package com.example.vyanktesh.drumpad3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String Tag="myActivity";
    Button two,one,three,four,five,six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("one");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("two");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("three");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("four");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("five");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic("six");
            }
        });
    }
    public void playMusic(String nameId){
        //id in the integer form


        int musicid=getResources().getIdentifier(nameId,"raw","com.example.vyanktesh.drumpad3");
        MediaPlayer md=MediaPlayer.create(this,musicid);
        md.start();
    }
}
