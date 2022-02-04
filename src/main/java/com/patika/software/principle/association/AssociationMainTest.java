package com.patika.software.principle.association;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AssociationMainTest {

    public static void main(String[] args) {
        Musteri musteri = Musteri
                .builder()
                .musteriAd("Halil")
                .musteriSehir("Ankara")
                .build();

        SuperMarket superMarket = SuperMarket
                .builder()
                .süperMarketAd("ÇokUcuz")
                .süperMarketSehir("Ankara")
                .build();

        //loose coupling (Zayıf bağlantı ==> Association)
        log.info("\nMüşteri adı : " + musteri.getMusteriAd() + "\nSüper market adı : " + superMarket.getSüperMarketAd());
    }
}
