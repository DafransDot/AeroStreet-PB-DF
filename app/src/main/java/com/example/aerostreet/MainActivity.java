package com.example.aerostreet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llCasual = findViewById(R.id.llCasual);
        LinearLayout llSport = findViewById(R.id.llSport);
        LinearLayout llColab = findViewById(R.id.llColab);


        llCasual.setOnClickListener(this);
        llSport.setOnClickListener(this);
        llColab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.llCasual){
            Intent intent = new Intent(this, casualMain.class);
            startActivity(intent);
        } else if (v.getId() == R.id.llSport) {
            Intent intent = new Intent(this, SportMain.class);
            startActivity(intent);
        } else if (v.getId() == R.id.llColab) {
            Intent intent = new Intent(this, colabMain.class);
            startActivity(intent);

        }

    }
}