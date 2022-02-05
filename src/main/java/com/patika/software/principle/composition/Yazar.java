package com.patika.software.principle.composition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

//1 yazar
public class Yazar {

    private String yazarAd;
    private String yazarSoyad;

    //Composition
    private List<Kitap> kitapList;

    public Yazar() {
    }

    public Yazar(String yazarAd, String yazarSoyad) {
        this.yazarAd = yazarAd;
        this.yazarSoyad = yazarSoyad;
    }

    @Override
    public String toString() {
        return "Yazar{" +
                "yazarAd='" + yazarAd + '\'' +
                ", yazarSoyad='" + yazarSoyad + '\'' +
                '}';
    }

    public String getYazarAd() {
        return yazarAd;
    }

    public void setYazarAd(String yazarAd) {
        this.yazarAd = yazarAd;
    }

    public String getYazarSoyad() {
        return yazarSoyad;
    }

    public void setYazarSoyad(String yazarSoyad) {
        this.yazarSoyad = yazarSoyad;
    }

    public List<Kitap> getKitapList() {
        return kitapList;
    }

    public void setKitapList(List<Kitap> kitapList) {
        this.kitapList = kitapList;
    }
}
