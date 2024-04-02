package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.NumberFormatter;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView txt_capital, txt_rate, txt_monthly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_capital=findViewById(R.id.editTextNumberDecimal);
        txt_rate=findViewById(R.id.editTextNumberDecimal2);
        txt_monthly=findViewById(R.id.textView);

        txt_capital.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(txt_capital.getText().length()!=0 &&txt_rate.getText().length()!=0){
                    double capital=Double.valueOf(txt_capital.getText().toString());
                    double rate=Double.valueOf(txt_rate.getText().toString());
                    double monthly_income=(capital*rate/100)/12;
                    DecimalFormat df=new DecimalFormat("#.###");
                    txt_monthly.setText(String.valueOf(df.format(monthly_income))+" TL");

                }
            }
        });

        txt_rate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(txt_capital.getText().length()!=0 &&txt_rate.getText().length()!=0){
                    double capital=Double.valueOf(txt_capital.getText().toString());
                    double rate=Double.valueOf(txt_rate.getText().toString());
                    double monthly_income=(capital*rate/100)/12;
                    DecimalFormat df=new DecimalFormat("#.###");
                    txt_monthly.setText(String.valueOf(df.format(monthly_income))+" TL");
                }
            }
        });


    }
}