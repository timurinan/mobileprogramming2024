package com.example.week11;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;

public class AddCustomerActivity extends AppCompatActivity {

    Spinner citySpinner;

    TextView txt_date, txt_name,txt_phone,txt_mail;

    Button save_button;

    ArrayList<Customer> customers=new ArrayList<Customer>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);

        citySpinner=findViewById(R.id.spn_city);
        save_button=findViewById(R.id.button);

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_surname=txt_name.getText().toString();
                String phone=txt_phone.getText().toString();
                String mail=txt_mail.getText().toString();
                String date=txt_date.getText().toString();
                String city=citySpinner.getSelectedItem().toString();

                Customer customer=new Customer(name_surname,mail,phone,city,date);
                customers.add(customer);

                Intent intent=new Intent(AddCustomerActivity.this, MainActivity.class);
                intent.putExtra("customers",customers);
                startActivity(intent);
            }
        });

        ArrayAdapter<CharSequence> spinner_Adapter=ArrayAdapter.createFromResource(getApplicationContext(),R.array.cities, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner_Adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        citySpinner.setAdapter(spinner_Adapter);

        txt_date=findViewById(R.id.txt_date);

        txt_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar=Calendar.getInstance();
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog theDialog=new DatePickerDialog(AddCustomerActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        txt_date.setText(year+"/"+month+"/"+day);
                    }
                },year,month,day);

                theDialog.show();
            }
        });


    }
}
