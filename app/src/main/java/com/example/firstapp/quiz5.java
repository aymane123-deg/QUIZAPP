package com.example.firstapp;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.firstapp.quiz1.nbr;


public class quiz5 extends AppCompatActivity {
    RadioGroup rg;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        rg=findViewById(R.id.rg);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rg.getCheckedRadioButtonId()== -1)
                {
                    Toast.makeText(quiz5.this, "Select Answer", Toast.LENGTH_SHORT).show();
                }else
                {
                    if(rg.getCheckedRadioButtonId()==R.id.rb1 )
                    {
                        nbr++;
                    }

                    //int nbr=getIntent().getIntExtra("nbr",0);

                    Intent intent=new Intent(quiz5.this,score.class);


                    intent.putExtra("nbr",nbr);
                    startActivity(intent);
                }
            }
        });
    }
}