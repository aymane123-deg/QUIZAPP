package com.example.firstapp;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;


public class quiz1 extends AppCompatActivity {
    RadioGroup rg;
    Button next;
    static int nbr=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        rg=findViewById(R.id.rg);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rg.getCheckedRadioButtonId()== -1)
                {
                    Toast.makeText(quiz1.this, "Select Answer", Toast.LENGTH_SHORT).show();
                }else
                {



                    Intent intent=new Intent(quiz1.this,quiz2.class);

                    if(rg.getCheckedRadioButtonId()==R.id.rb1)
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