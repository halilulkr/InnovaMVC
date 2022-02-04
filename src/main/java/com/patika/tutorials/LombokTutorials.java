package com.patika.tutorials;

import lombok.*;

@Data //Getter,Setter,HashCode,ToString
@AllArgsConstructor //Parametreli constructor
@NoArgsConstructor //Parametresiz constructor
@Builder
public class LombokTutorials {
    private String ad;
    private String soyad;
    private String numara;

    public static void main(String[] args) {
        LombokTutorials lombokTutorials = LombokTutorials
                .builder()
                .ad("Halil")
                .soyad("Ülker")
                .numara("1234567abc")
                .build(); //Builder yapısı

        System.out.println(lombokTutorials);
    }
}
