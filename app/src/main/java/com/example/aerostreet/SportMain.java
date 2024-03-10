package com.example.aerostreet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SportMain extends AppCompatActivity implements View.OnClickListener {
    private Button btnDetailSportOne, btnDetailSporttwo, btnDetailSportthree, btnDetailSportfour, btnDetailSportfive;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_main);

        btnDetailSportOne = findViewById(R.id.btnDetailSportOne);
        btnDetailSporttwo = findViewById(R.id.btnDetailSporttwo);
        btnDetailSportthree = findViewById(R.id.btnDetailSportthree);
        btnDetailSportfour = findViewById(R.id.btnDetailSportfour);
        btnDetailSportfive = findViewById(R.id.btnDetailSportfive);

        btnDetailSportOne.setOnClickListener(this);
        btnDetailSporttwo.setOnClickListener(this);
        btnDetailSportthree.setOnClickListener(this);
        btnDetailSportfour.setOnClickListener(this);
        btnDetailSportfive.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnDetailSportOne) {
            Detail SportOne = new Detail();
            SportOne.setMerek("");
            SportOne.setAcara("asdasdj");
            SportOne.setTinggiSepatu("");
            SportOne.setStok("");
            SportOne.setDikirimDari("");
            SportOne.setGambar("CasualOne");

            Intent intent = new Intent(SportMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, SportOne);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailSporttwo) {
            Detail SportTwo = new Detail();
            SportTwo.setMerek("");
            SportTwo.setAcara("asdasdj");
            SportTwo.setTinggiSepatu("");
            SportTwo.setStok("");
            SportTwo.setDikirimDari("");
            SportTwo.setGambar("CasualTwo");

            Intent intent = new Intent(SportMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, SportTwo);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailSportthree) {
            Detail SportThree = new Detail();
            SportThree.setMerek("");
            SportThree.setAcara("asdasdj");
            SportThree.setTinggiSepatu("");
            SportThree.setStok("");
            SportThree.setDikirimDari("");
            SportThree.setGambar("CasualThree");

            Intent intent = new Intent(SportMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, SportThree);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailCasualfour) {
            Detail CasualFour = new Detail();
            CasualFour.setMerek("");
            CasualFour.setAcara("asdasdj");
            CasualFour.setTinggiSepatu("");
            CasualFour.setStok("");
            CasualFour.setDikirimDari("");
            CasualFour.setGambar("CasualFour");

            Intent intent = new Intent(SportMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualFour);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailCasualfive) {
            Detail CasualFive = new Detail();
            CasualFive.setMerek("");
            CasualFive.setAcara("asdasdj");
            CasualFive.setTinggiSepatu("");
            CasualFive.setStok("");
            CasualFive.setDikirimDari("");
            CasualFive.setGambar("CasualFive");

            Intent intent = new Intent(SportMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualFive);
            startActivity(intent);
        }
    }


}