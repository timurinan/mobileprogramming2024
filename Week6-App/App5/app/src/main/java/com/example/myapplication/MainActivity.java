package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt_midterm, txt_midterm_percentage,txt_final,txt_final_percentage, txt_lab,txt_lab_percentage,txt_result;
    Button buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_midterm=findViewById(R.id.txt_midterm);
        txt_midterm_percentage=findViewById(R.id.txt_midterm_percentage);
        txt_final=findViewById(R.id.txt_final);
        txt_final_percentage=findViewById(R.id.txt_final_percentage);
        txt_lab=findViewById(R.id.txt_lab);
        txt_lab_percentage=findViewById(R.id.txt_lab_percentage);
        txt_result=findViewById(R.id.textView7);
        buton=findViewById(R.id.button);

        buton.setOnClickListener(v -> calculate());

    }

    private void calculate() {

        if(txt_midterm.getText().length()>0&&txt_final.getText().length()>0&&txt_lab.getText().length()>0){
            if(txt_midterm_percentage.getText().length()>0&&txt_final_percentage.getText().length()>0&&txt_lab_percentage.getText().length()>0){
                double midterm_percentage=Double.valueOf(txt_midterm_percentage.getText().toString());
                double final_percentage=Double.valueOf(txt_final_percentage.getText().toString());
                double lab_percentage=Double.valueOf(txt_lab_percentage.getText().toString());

                if(midterm_percentage+final_percentage+lab_percentage==100){

                    double midterm_grade=Double.valueOf(txt_midterm.getText().toString());
                    double final_grade=Double.valueOf(txt_final.getText().toString());
                    double lab_grade=Double.valueOf(txt_lab.getText().toString());

                    if((midterm_grade>=0&&midterm_grade<=100)&&(final_grade>=0&&final_grade<=100)&&(lab_grade>=0&&lab_grade<=100)){
                        double result=(midterm_grade*midterm_percentage/100)+(final_grade*final_percentage/100)+(lab_grade*lab_percentage/100);
                        txt_result.setText("Your mean grade:"+result);
                    }else{
                        Toast.makeText(getApplicationContext(), "Grades should be between 0 and 100", Toast.LENGTH_LONG).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"Percentage total should be 100",Toast.LENGTH_LONG).show();
                }

            }else{
                Toast.makeText(getApplicationContext(),"Percentages can not be empty...",Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(getApplicationContext(),"Midterm, Final or Lab can not be empty...", Toast.LENGTH_LONG).show();
        }
    }
}