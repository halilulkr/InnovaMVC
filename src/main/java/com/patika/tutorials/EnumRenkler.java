package com.patika.tutorials;

import lombok.Getter;
import lombok.Setter;

import java.util.Locale;

//type safe
public enum EnumRenkler {
    MAVI,YESIL,KIRMIZI
}

enum Renkler2{
    MAVI(1, "mavi"),YESIL(2, "yesil"),KIRMIZI(3, "kirmizi");

    @Getter @Setter
    private final int renkId;

    @Getter @Setter
    private final String renkAd;

    private Renkler2(int renkId, String renkAd){
        this.renkId = renkId;
        this.renkAd = renkAd;
    }
}

class Deneme{
    public static void main(String[] args) {
        EnumRenkler renkler = EnumRenkler.MAVI;
        System.out.println(renkler);
        //String değişken
        String renkler2 = EnumRenkler.MAVI.toString();
        System.out.println(renkler2.toLowerCase());
        //ordinal index numarasını verir.
        EnumRenkler renkler3 = EnumRenkler.MAVI;
        System.out.println(renkler3.ordinal());

        System.out.println("**********************************");

        String constructor = Renkler2.KIRMIZI.getRenkAd();
        System.out.println(constructor);
    }
}
