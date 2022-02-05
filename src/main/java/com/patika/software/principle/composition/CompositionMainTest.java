package com.patika.software.principle.composition;

import java.util.ArrayList;

public class CompositionMainTest {

    public static void main(String[] args) {
        Yazar yazar = new Yazar();
        yazar.setYazarAd("Halil");
        yazar.setYazarSoyad("Ülker");
        yazar.setKitapList(new ArrayList<Kitap>());

        System.out.println(yazar);

        Kitap kitap = new Kitap();
        kitap.setKitapAd("Avengers");
        kitap.setKitapFiyat(123);
        kitap.setYazar(yazar);
        kitap.getYazar().getKitapList().add(kitap);

        Kitap kitap2 = new Kitap();
        kitap2.setKitapAd("Never-Forget");
        kitap2.setKitapFiyat(321);
        kitap2.setYazar(yazar);
        kitap2.getYazar().getKitapList().add(kitap2);

        System.out.println(kitap);
        System.out.println(kitap2);

    }
}
