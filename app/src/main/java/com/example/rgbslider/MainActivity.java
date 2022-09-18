package com.example.rgbslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.slider.Slider;


public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private TextView redText;
    private TextView greenText;
    private TextView blueText;
    private Slider red;
    private Slider green;
    private Slider blue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init(){
        layout = findViewById(R.id.layout);
        redText = findViewById(R.id.redText);
        greenText = findViewById(R.id.greenText);
        blueText = findViewById(R.id.blueText);
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);

    }
}