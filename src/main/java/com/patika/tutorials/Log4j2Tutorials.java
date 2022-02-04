package com.patika.tutorials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Builder
@Log4j2
public class Log4j2Tutorials {

    private String ad;
    private String soyad;
    private String numara;

    public Log4j2Tutorials() {
        this.ad = "Adınızı girmediniz";
        this.soyad = "Ülker";
        this.numara = "1234567abc";
    }

    //Quick Info:
    //-Shift+F6 = Refactor
    //-Alt+Insert = Generate => Getter, Setter, Constructor etc.
    //-Ctrl+Shift+O = Maven install
    public static void main(String[] args) {
        Log4j2Tutorials log4j2Tutorials = new Log4j2Tutorials();
        System.out.println(log4j2Tutorials);

        if(log4j2Tutorials.getAd().equals("Adınızı girmediniz")){
            log.error("Hata adınızı girmediniz !!!"); //Hatanın zamanını, yerini ve sonucunu error olarak gösterir.
        }else{
            log.info("Bilgiler girildi");
        }
    }
}
