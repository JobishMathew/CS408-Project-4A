package com.example.jsu.project4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculator extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }
    public void onlickCalculate(View v){
        EditText etTotalAmount = (EditText) findViewById(R.id.txtTotalBill);
        EditText etTipPercentage = (EditText) findViewById(R.id.txtTipPercentage);
        EditText etNumberOfPeople = (EditText) findViewById(R.id.txtNumberOfPeople);

        double totalAmount = Double.parseDouble(etTotalAmount.getText().toString());
        double tipPercentage = Double.parseDouble(etTipPercentage.getText().toString());
        int people = Integer.parseInt(etNumberOfPeople.getText().toString());

        double individualTax = (((tipPercentage / totalAmount ) * 100 ) / people) ;
        double individualPay = ( totalAmount / people ) + individualTax;

        ((TextView)findViewById(R.id.txtTotalPerPerson)).setText("Amount per person: $" + String.format("%.2f", individualPay));
    }
}
