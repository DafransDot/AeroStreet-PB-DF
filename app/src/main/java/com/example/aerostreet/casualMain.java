package com.example.aerostreet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class casualMain extends AppCompatActivity implements View.OnClickListener {
    private Button btnDetailCasualone, btnDetailCasualtwo, btnDetailCasualthree, btnDetailCasualfour, btnDetailCasualfive;

    private ImageView ivCasualone,ivCasualtwo, ivCasualthree, ivCasualfour, ivCasualfive;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casual_main);

        btnDetailCasualone = findViewById(R.id.btnDetailCasualone);
        btnDetailCasualtwo = findViewById(R.id.btnDetailCasualtwo);
        btnDetailCasualthree = findViewById(R.id.btnDetailCasualthree);
        btnDetailCasualfour = findViewById(R.id.btnDetailCasualfour);
        btnDetailCasualfive = findViewById(R.id.btnDetailCasualfive);
        ivCasualone = findViewById(R.id.ivCasualone);
        ivCasualtwo = findViewById(R.id.ivCasualtwo);
        ivCasualthree = findViewById(R.id.ivCasualthree);
        ivCasualfour= findViewById(R.id.ivCasualfour);
        ivCasualfive = findViewById(R.id.ivCasualfive);


        btnDetailCasualone.setOnClickListener(this);
        btnDetailCasualtwo.setOnClickListener(this);
        btnDetailCasualthree.setOnClickListener(this);
        btnDetailCasualfour.setOnClickListener(this);
        btnDetailCasualfive.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      if (v.getId() == R.id.btnDetailCasualone) {
            Detail CasualOne = new Detail();
            CasualOne.setMerek("");
            CasualOne.setAcara("asdasdj");
            CasualOne.setTinggiSepatu("");
            CasualOne.setStok("");
            CasualOne.setDikirimDari("");
            CasualOne.setGambar("CasualOne");

            Intent intent = new Intent(casualMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualOne);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailCasualtwo) {
            Detail CasualTwo = new Detail();
            CasualTwo.setMerek("");
            CasualTwo.setAcara("asdasdj");
            CasualTwo.setTinggiSepatu("");
            CasualTwo.setStok("");
            CasualTwo.setDikirimDari("");
            CasualTwo.setGambar("CasualTwo");

            Intent intent = new Intent(casualMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualTwo);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailCasualthree) {
            Detail CasualThree = new Detail();
            CasualThree.setMerek("");
            CasualThree.setAcara("asdasdj");
            CasualThree.setTinggiSepatu("");
            CasualThree.setStok("");
            CasualThree.setDikirimDari("");
            CasualThree.setGambar("CasualThree");

            Intent intent = new Intent(casualMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualThree);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailCasualfour) {
            Detail CasualFour = new Detail();
            CasualFour.setMerek("");
            CasualFour.setAcara("asdasdj");
            CasualFour.setTinggiSepatu("");
            CasualFour.setStok("");
            CasualFour.setDikirimDari("");
            CasualFour.setGambar("CasualFour");

            Intent intent = new Intent(casualMain.this, DetailMain.class);
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

            Intent intent = new Intent(casualMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualFive);
            startActivity(intent);
        }
    }
}