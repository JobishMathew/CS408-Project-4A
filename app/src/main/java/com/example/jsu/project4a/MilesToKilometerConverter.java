package com.example.jsu.project4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MilesToKilometerConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles_to_kilometer_converter);
    }
    public void onclickButton(View v){


        String m = ((EditText) findViewById(R.id.txtMiles)).getText().toString();
        String k = ((EditText) findViewById(R.id.txtKiloMeter)).getText().toString();

        if (m.isEmpty()){
            if(!k.isEmpty()) {
                double kilometers = Double.parseDouble(k);
                double miles = ( 0.621371 * kilometers);
                ((EditText) findViewById((R.id.txtMiles))).setText(String.format("%.2f",miles) + " Miles");
            }
        }
        else{
            double miles = Double.parseDouble(m);
            double kilometer = (1.60934 * miles);
            ((EditText) findViewById(R.id.txtKiloMeter)).setText(String.format("%.2f",kilometer)+ " km");
        }
    }
}
