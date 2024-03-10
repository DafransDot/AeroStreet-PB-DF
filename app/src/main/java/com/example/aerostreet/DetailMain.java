package com.example.aerostreet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMain extends AppCompatActivity {
    public static final String KEY_DATA = "key_object";

    private TextView tvMerek, tvAcara, tvTinggiSepatu, tvStok, tvDikirim;
    private ImageView ivGambar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_main);

        tvMerek = findViewById(R.id.tvMerek);
        tvAcara = findViewById(R.id.tvAcara);
        tvTinggiSepatu = findViewById(R.id.tvTinggiSepatu);
        tvStok = findViewById(R.id.tvStok);
        tvDikirim = findViewById(R.id.tvDikirim);
        ivGambar = findViewById(R.id.ivGambar);


        Detail detail;
        if(Build.VERSION.SDK_INT >= 33){
            detail =getIntent().getParcelableExtra(KEY_DATA,Detail.class);
        }else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }

        String gambar = detail.getGambar();
        int id = getResources().getIdentifier(gambar,"drawable",getPackageName());
        ivGambar.setImageResource(id);
        tvMerek.setText(detail.getMerek());
        tvAcara.setText(detail.getAcara());
        tvTinggiSepatu.setText(detail.getTinggiSepatu());
        tvStok.setText(detail.getStok());
        tvDikirim.setText(detail.getDikirimDari());





    }
}