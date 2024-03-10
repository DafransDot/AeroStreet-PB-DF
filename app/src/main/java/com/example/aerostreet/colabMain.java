package com.example.aerostreet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class colabMain extends AppCompatActivity implements View.OnClickListener {
    private Button btnDetailColabone, btnDetailColabtwo, btnDetailColabthree, btnDetailColabfour, btnDetailColabfive;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colab_main);

        btnDetailColabone = findViewById(R.id.btnDetailColabone);
        btnDetailColabtwo = findViewById(R.id.btnDetailColabtwo);
        btnDetailColabthree = findViewById(R.id.btnDetailColabthree);
        btnDetailColabfour = findViewById(R.id.btnDetailColabfour);
        btnDetailColabfive = findViewById(R.id.btnDetailColabfive);

        btnDetailColabone.setOnClickListener(this);
        btnDetailColabtwo.setOnClickListener(this);
        btnDetailColabthree.setOnClickListener(this);
        btnDetailColabfour.setOnClickListener(this);
        btnDetailColabfive.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnDetailColabone) {
            Detail ColabOne = new Detail();
            ColabOne.setMerek("");
            ColabOne.setAcara("asdasdj");
            ColabOne.setTinggiSepatu("");
            ColabOne.setStok("");
            ColabOne.setDikirimDari("");
            ColabOne.setGambar("CasualOne");

            Intent intent = new Intent(colabMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, ColabOne);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailColabtwo) {
            Detail colabTwo = new Detail();
            colabTwo.setMerek("");
            colabTwo.setAcara("asdasdj");
            colabTwo.setTinggiSepatu("");
            colabTwo.setStok("");
            colabTwo.setDikirimDari("");
            colabTwo.setGambar("CasualTwo");

            Intent intent = new Intent(colabMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, colabTwo);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailColabthree) {
            Detail colabThree = new Detail();
            colabThree.setMerek("");
            colabThree.setAcara("asdasdj");
            colabThree.setTinggiSepatu("");
            colabThree.setStok("");
            colabThree.setDikirimDari("");
            colabThree.setGambar("CasualThree");

            Intent intent = new Intent(colabMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, colabThree);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailColabfour) {
            Detail ColabFour = new Detail();
            ColabFour.setMerek("");
            ColabFour.setAcara("asdasdj");
            ColabFour.setTinggiSepatu("");
            ColabFour.setStok("");
            ColabFour.setDikirimDari("");
            ColabFour.setGambar("CasualFour");

            Intent intent = new Intent(colabMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, ColabFour);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailColabfive) {
            Detail colabFive = new Detail();
            colabFive.setMerek("");
            colabFive.setAcara("asdasdj");
            colabFive.setTinggiSepatu("");
            colabFive.setStok("");
            colabFive.setDikirimDari("");
            colabFive.setGambar("CasualFive");

            Intent intent = new Intent(colabMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, colabFive);
            startActivity(intent);
        }

    }
}