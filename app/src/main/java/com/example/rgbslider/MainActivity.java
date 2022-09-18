package com.example.rgbslider;

import androidx.annotation.NonNull;
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
        red.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                //redText.setText((int) red.getValue());
            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {

            }
        });
        green.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                //greenText.setText((int) green.getValue());
            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {

            }
        });
        blue.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                //blueText.setText((int) blue.getValue());
            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {

            }
        });
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