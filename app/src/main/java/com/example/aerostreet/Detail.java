package com.example.aerostreet;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Detail implements Parcelable {
    private String merek, acara, tinggiSepatu,Stok, dikirimDari, gambar;


    public Detail(){
    }

    public String getMerek() {
        return merek;
    }
    public void setMerek(String Merek){
        merek = Merek;
    }

    public String getAcara(){
        return acara;
    }

    public void setAcara(String Acara) {
        acara = Acara;
    }

    public String getTinggiSepatu() {
        return tinggiSepatu;
    }

    public void setTinggiSepatu(String TinggiSepatu) {
        tinggiSepatu = TinggiSepatu;
    }

    public String getStok() {
        return Stok;
    }

    public void setStok(String stok) {
        Stok = stok;
    }

    public String getDikirimDari() {
        return dikirimDari;
    }

    public void setDikirimDari(String DikirimDari) {
        dikirimDari = DikirimDari;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String Gambar) {
        gambar = Gambar;
    }

    protected Detail(Parcel in) {
        merek = in.readString();
        acara = in.readString();
        tinggiSepatu = in.readString();
        Stok = in.readString();
        dikirimDari = in.readString();
        gambar =in.readString();

    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
    dest.writeString(merek);
    dest.writeString(acara);
    dest.writeString(tinggiSepatu);
    dest.writeString(Stok);
    dest.writeString(dikirimDari);

    }
}
