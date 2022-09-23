package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rLayout;
    private TextView tw;
    private Button plusbutton;
    private Button minusbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    private void init(){
        rLayout = findViewById(R.id.rLayout);
        tw = findViewById(R.id.tw);
        plusbutton = findViewById(R.id.plusbutton);
        minusbutton = findViewById(R.id.minusbutton);
    }
}