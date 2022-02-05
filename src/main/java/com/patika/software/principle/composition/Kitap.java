package com.patika.software.principle.composition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//n kitap
public class Kitap {

    private String kitapAd;
    private double kitapFiyat;

    //Composition
    private Yazar yazar;

    public Kitap() {
    }

    public Kitap(String kitapAd, double kitapFiyat){
        this.kitapAd = kitapAd;
        this.kitapFiyat = kitapFiyat;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAd='" + kitapAd + '\'' +
                ", kitapFiyat=" + kitapFiyat +
                '}';
    }

    public String getKitapAd() {
        return kitapAd;
    }

    public void setKitapAd(String kitapAd) {
        this.kitapAd = kitapAd;
    }

    public double getKitapFiyat() {
        return kitapFiyat;
    }

    public void setKitapFiyat(double kitapFiyat) {
        this.kitapFiyat = kitapFiyat;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }
}
