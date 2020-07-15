package com.example.firstapp;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.firstapp.quiz1.nbr;


public class quiz2 extends AppCompatActivity {
    RadioGroup rg;
    RadioGroup rg1;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        rg=findViewById(R.id.rg);
        rg1=findViewById(R.id.rg1);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rg.getCheckedRadioButtonId()== -1 || rg1.getCheckedRadioButtonId()== -1)
                {
                    Toast.makeText(quiz2.this, "Select Answer", Toast.LENGTH_SHORT).show();
                }else
                {


                   // int nbr=getIntent().getIntExtra("nbr",0);

                    Intent intent=new Intent(quiz2.this,quiz3.class);

                    if(rg.getCheckedRadioButtonId()==R.id.rb1 && rg1.getCheckedRadioButtonId()==R.id.rb3)
                    {
                        nbr++;
                    }
                    intent.putExtra("nbr",nbr);
                    startActivity(intent);
                }
            }
        });
    }
}