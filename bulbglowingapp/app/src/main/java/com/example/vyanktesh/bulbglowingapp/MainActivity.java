package com.example.vyanktesh.bulbglowingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=findViewById(R.id.iv);
        iv.setVisibility(View.INVISIBLE);

    }
    public void changeVibrateState(View view){
        boolean checked=((ToggleButton)view).isChecked();
        if (checked){
            iv.setImageResource(R.drawable.ic_lightbulb_bulb);
            iv.setVisibility(View.VISIBLE);
        }
        else {
            iv.setImageResource(R.drawable.ic_lightbulb_bulboff);
        }
    }


}
