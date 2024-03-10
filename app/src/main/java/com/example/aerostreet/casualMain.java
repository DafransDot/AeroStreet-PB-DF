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
            CasualOne.setMerek("Aerostreet Hoops High Gum Off White Off White");
            CasualOne.setAcara("Sepatu Sneakers Casual Aero Street 21JJ10");
            CasualOne.setTinggiSepatu("37 - 44");
            CasualOne.setStok("334");
            CasualOne.setDikirimDari("KAB. KLATEN");
            CasualOne.setGambar("CasualOne");

            Intent intent = new Intent(casualMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualOne);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailCasualtwo) {
            Detail CasualTwo = new Detail();
            CasualTwo.setMerek("Aerostreet Massive Basic Olive Natural");
            CasualTwo.setAcara("Sneaker Casual Shoes");
            CasualTwo.setTinggiSepatu("37-44 ");
            CasualTwo.setStok("412");
            CasualTwo.setDikirimDari("KAB. KLATEN");
            CasualTwo.setGambar("CasualTwo");

            Intent intent = new Intent(casualMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualTwo);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailCasualthree) {
            Detail CasualThree = new Detail();
            CasualThree.setMerek("Aerostreet Massive Basic Hitam Natural");
            CasualThree.setAcara("Sepatu Sneakers Casual");
            CasualThree.setTinggiSepatu("37-44");
            CasualThree.setStok("265");
            CasualThree.setDikirimDari("KAB. KLATEN");
            CasualThree.setGambar("CasualThree");

            Intent intent = new Intent(casualMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualThree);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailCasualfour) {
            Detail CasualFour = new Detail();
            CasualFour.setMerek("Aerostreet Hoops Low Merah");
            CasualFour.setAcara("Sepatu Sneakers Casual");
            CasualFour.setTinggiSepatu("42");
            CasualFour.setStok("129");
            CasualFour.setDikirimDari("KAB. KLATEN");
            CasualFour.setGambar("CasualFour");

            Intent intent = new Intent(casualMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualFour);
            startActivity(intent);
        } if (v.getId() == R.id.btnDetailCasualfive) {
            Detail CasualFive = new Detail();
            CasualFive.setMerek("Aerostreet Hoops High Gum Olive");
            CasualFive.setAcara("Sneakers Casual");
            CasualFive.setTinggiSepatu("37 - 44");
            CasualFive.setStok("234");
            CasualFive.setDikirimDari("KAB. KLATEN");
            CasualFive.setGambar("CasualFive");

            Intent intent = new Intent(casualMain.this, DetailMain.class);
            intent.putExtra(DetailMain.KEY_DATA, CasualFive);
            startActivity(intent);
        }
    }
}