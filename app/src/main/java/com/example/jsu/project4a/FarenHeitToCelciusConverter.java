package com.example.jsu.project4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FarenHeitToCelciusConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faren_heit_to_celcius_converter);
    }

    public void onclickButton(View v){


        String f = ((EditText) findViewById(R.id.txtFarenheit)).getText().toString();
        String c = ((EditText) findViewById(R.id.txtCelcius)).getText().toString();

        if (f.isEmpty()){
            if(!c.isEmpty()) {
                double celcius = Double.parseDouble(c);
                double faren = ((celcius * 9 / 5) + 32);
                ((EditText) findViewById((R.id.txtFarenheit))).setText(String.format("%.2f",faren) + " \u2109");
            }
        }
        else{
            double farenh = Double.parseDouble(f);
            double celcius = ((farenh - 32) * 5 /9);
             ((EditText) findViewById(R.id.txtCelcius)).setText(String.format("%.2f",celcius)+ " \u2103");
        }
    }

}

