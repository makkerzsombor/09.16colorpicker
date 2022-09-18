package com.example.rgbslider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
    private TextView rgbColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        red.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                String piros = String.format("%s",red.getValue());
                redText.setText(piros);
                layout.setBackgroundColor(Color.rgb((int)red.getValue(),(int)green.getValue(),(int)blue.getValue()));
                String szinSzoveges = String.format("(%d, %d, %d)",(int)red.getValue(), (int)green.getValue(), (int)blue.getValue());
                rgbColor.setText(szinSzoveges);
                if ((int)red.getValue()+(int)green.getValue()+(int)blue.getValue()>450){
                    rgbColor.setTextColor(Color.BLACK);
                }else{
                    rgbColor.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {
                String piros = String.format("%s",red.getValue());
                redText.setText(piros);
            }
        });
        green.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                String zold = String.format("%s",green.getValue());
                greenText.setText(zold);
                layout.setBackgroundColor(Color.rgb((int)red.getValue(),(int)green.getValue(),(int)blue.getValue()));
                layout.setBackgroundColor(Color.rgb((int)red.getValue(),(int)green.getValue(),(int)blue.getValue()));
                String szinSzoveges = String.format("(%d, %d, %d)",(int)red.getValue(), (int)green.getValue(), (int)blue.getValue());
                rgbColor.setText(szinSzoveges);
                if ((int)red.getValue()+(int)green.getValue()+(int)blue.getValue()>450){
                    rgbColor.setTextColor(Color.BLACK);
                }else{
                    rgbColor.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {
                String zold = String.format("%s",green.getValue());
                greenText.setText(zold);
            }
        });
        blue.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                String kek = String.format("%s",blue.getValue());
                blueText.setText(kek);
                layout.setBackgroundColor(Color.rgb((int)red.getValue(),(int)green.getValue(),(int)blue.getValue()));
                layout.setBackgroundColor(Color.rgb((int)red.getValue(),(int)green.getValue(),(int)blue.getValue()));
                String szinSzoveges = String.format("(%d, %d, %d)",(int)red.getValue(), (int)green.getValue(), (int)blue.getValue());
                rgbColor.setText(szinSzoveges);
                if ((int)red.getValue()+(int)green.getValue()+(int)blue.getValue()>450){
                    rgbColor.setTextColor(Color.BLACK);
                }else{
                    rgbColor.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {
                String kek = String.format("%s",blue.getValue());
                blueText.setText(kek);
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
        rgbColor = findViewById(R.id.rgbColor);
    }
}