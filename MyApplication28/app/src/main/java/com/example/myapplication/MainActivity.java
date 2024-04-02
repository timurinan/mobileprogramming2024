package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager2 vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp=findViewById(R.id.viewPager2);

        Account account1=new Account("Timur İnan","TL",2000);
        Account account2=new Account("Ahmet İnan","Euro",500);
        Account account3=new Account("Hakan İnan","Dollar",4000);
        Account account4=new Account("Hande İnan","Gold",2);
        Account account5=new Account("Hatice İnan","Euro",6000);

        Fragment_Customer fragmentCustomer1=new Fragment_Customer();
        fragmentCustomer1.setAccount(account1);

        Fragment_Customer fragmentCustomer2=new Fragment_Customer();
        fragmentCustomer2.setAccount(account2);

        Fragment_Customer fragmentCustomer3=new Fragment_Customer();
        fragmentCustomer3.setAccount(account3);

        Fragment_Customer fragmentCustomer4=new Fragment_Customer();
        fragmentCustomer4.setAccount(account4);

        Fragment_Customer fragmentCustomer5=new Fragment_Customer();
        fragmentCustomer5.setAccount(account5);

        MyFragmentAdapter adapter=new MyFragmentAdapter(getSupportFragmentManager(),getLifecycle());

        adapter.add(fragmentCustomer1);
        adapter.add(fragmentCustomer2);
        adapter.add(fragmentCustomer3);
        adapter.add(fragmentCustomer4);
        adapter.add(fragmentCustomer5);

        vp.setAdapter(adapter);

    }
}