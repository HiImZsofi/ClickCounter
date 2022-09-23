package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rLayout;
    private TextView tw;
    private Button plusbutton;
    private Button minusbutton;
    public int click;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click++;
                if (click > 0){
                    tw.setText(click);
                    tw.setTextColor(Color.rgb(0, 255, 0));
                }
                else if(click < 0){
                    tw.setText(click);
                    tw.setTextColor(Color.rgb(255, 0, 0));
                }
                else{
                    tw.setText(click);
                    tw.setTextColor(Color.rgb(255, 255, 255));
                }
            }
        });

        minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click--;
                if (click > 0){
                    tw.setText(click);
                    tw.setTextColor(Color.rgb(0, 255, 0));
                }
                else if(click < 0){
                    tw.setText(click);
                    tw.setTextColor(Color.rgb(255, 0, 0));
                }
                else{
                    tw.setText(click);
                    tw.setTextColor(Color.rgb(255, 255, 255));
                }
            }
        });

    }

    private void init(){
        rLayout = findViewById(R.id.rLayout);
        tw = findViewById(R.id.tw);
        plusbutton = findViewById(R.id.plusbutton);
        minusbutton = findViewById(R.id.minusbutton);
        click = 0;
    }
}