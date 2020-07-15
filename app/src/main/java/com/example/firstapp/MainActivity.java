package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView edit3=null;
    private EditText edit1=null;
    private EditText edit2=null;
    private Button btn=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText) findViewById(R.id.edit1);
        edit2=(EditText) findViewById(R.id.edit2);
        btn=(Button) findViewById(R.id.btn);
        edit3=(TextView)findViewById(R.id.edit3) ;


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(edit1.getText().toString().equals("aiman") && edit2.getText().toString().equals("elkodri")){
                    startActivity(new Intent(MainActivity.this,quiz1.class));
                }
                else {
                    Toast.makeText(getApplicationContext(),"login or password incorrecte",Toast.LENGTH_SHORT).show();
                }
            }

        });

        edit3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,signin.class));
            }
        });





    }


}
