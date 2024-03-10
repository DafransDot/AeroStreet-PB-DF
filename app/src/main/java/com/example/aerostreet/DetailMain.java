package com.example.aerostreet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMain extends AppCompatActivity implements View.OnClickListener {
    public static final String KEY_DATA = "key_object";

    private TextView tvMerek, tvAcara, tvTinggiSepatu, tvStok, tvDikirim;
    private Button btnShare;



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
        btnShare = findViewById(R.id.btnShare);

        btnShare.setOnClickListener(v->shareDetailToTelegram());



        Detail detail;
        if(Build.VERSION.SDK_INT >= 33){
            detail =getIntent().getParcelableExtra(KEY_DATA,Detail.class);
        }else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }



        tvMerek.setText(detail.getMerek());
        tvAcara.setText(detail.getAcara());
        tvTinggiSepatu.setText(detail.getTinggiSepatu());
        tvStok.setText(detail.getStok());
        tvDikirim.setText(detail.getDikirimDari());







    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnShare){


        }
    }

    private void shareDetailToTelegram() {
        String shareText = "Merek: " + tvMerek.getText().toString() + "\n" +
                "Acara: " + tvAcara.getText().toString() + "\n" +
                "Tinggi Sepatu: " + tvTinggiSepatu.getText().toString() + "\n" +
                "Stok: " + tvStok.getText().toString() + "\n" +
                "Dikirim Dari: " + tvDikirim.getText().toString();

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

        // Menentukan paket Telegram
        shareIntent.setPackage("org.telegram.messenger");

        try {
            startActivity(shareIntent);
        } catch (ActivityNotFoundException e) {
            // Handle jika Telegram tidak terinstal
            // Misalnya, tampilkan pesan kepada pengguna untuk mengunduh Telegram
            showToast("Aplikasi Telegram tidak terinstal");
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}