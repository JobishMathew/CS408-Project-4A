package com.example.jsu.project4a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickTipToCalcualtor(View V){
        Intent i = new Intent(this, TipCalculator.class);
        startActivity(i);
    }
    public void clickDistanceCalcultor(View V){
        Intent i = new Intent(this, MilesToKilometerConverter.class);
        startActivity(i);
    }
    public void clickTempCalcualtor(View V){
        Intent i = new Intent(this, FarenHeitToCelciusConverter.class);
        startActivity(i);
    }
}
