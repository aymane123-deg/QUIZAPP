package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signin extends AppCompatActivity {
    EditText edit1,edit2,edit3; // for Sign up
    Button next;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        fAuth = FirebaseAuth.getInstance();
        next=findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= edit1.getText().toString().trim();
                String email = edit2.getText().toString().trim();
                String password = edit3.getText().toString().trim();
                if(TextUtils.isEmpty(email)){
                    edit2.setError("Email in Required.");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    edit3.setError("Password in Required.");
                    return;
                }


                // register The user in firebase
                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(signin.this,"User Created",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(signin.this,MainActivity.class));
                        }
                        else{
                            Toast.makeText(signin.this,"Error !"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                        }
                    }
                });

            }
        });


    }
}