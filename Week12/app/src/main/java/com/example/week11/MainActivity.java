package com.example.week11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton theButton;
    RecyclerView rv;

    ArrayList<Customer> customers=new ArrayList<Customer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theButton=findViewById(R.id.floatingActionButton);
        rv=findViewById(R.id.recyclerView);

        theButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, AddCustomerActivity.class);
                intent.putExtra("customers",customers);
                intent.putExtra("amount",customers.size());
                startActivity(intent);
            }
        });
        int amount=getIntent().getIntExtra("amount",0);
        if(amount!=0)
            customers= (ArrayList<Customer>) getIntent().getSerializableExtra("customers");
        //customers.add(new Customer("Timur İnan","timurinan@hotmail.com","99999","İstanbul","14/08/85"));
        MyAdapter myAdapter=new MyAdapter(customers,getApplicationContext());

        rv.setAdapter(myAdapter);

        LinearLayoutManager lm=new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(lm);
    }
}