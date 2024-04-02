package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button button_fragment1,button_fragment2;
    FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_fragment1=findViewById(R.id.button);
        button_fragment2=findViewById(R.id.button2);

        fl=findViewById(R.id.framelayout);

        button_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();

                ft.setReorderingAllowed(true);
                ft.replace(R.id.framelayout,new Fragment1(),null);
                ft.commit();
              //  getSupportFragmentManager().beginTransaction().add(R.id.framelayout,new Fragment1(),null).setReorderingAllowed(true).commit();
            }
        });

        button_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();

                ft.setReorderingAllowed(true);
                ft.replace(R.id.framelayout,new Fragment2(),null);
                ft.commit();
            }
        });
    }
}