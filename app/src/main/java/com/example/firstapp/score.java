package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.firstapp.quiz1.nbr;

public class score extends AppCompatActivity {

    ProgressBar pb;
    TextView te1;
    Button map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Toast.makeText(score.this, "your score is"+nbr, Toast.LENGTH_SHORT).show();
        pb=findViewById(R.id.pb);
        map=findViewById(R.id.map);
        te1=findViewById(R.id.te1);
        nbr=nbr/3;
        nbr=nbr*100;
        te1.setText("your score is "+nbr);
       // int nbr=getIntent().getIntExtra("nbr",0);
        pb.setProgress(nbr);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(score.this, maps.class));
            }
        });

    }


}
