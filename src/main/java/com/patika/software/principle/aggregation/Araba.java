package com.patika.software.principle.aggregation;

import lombok.*;
import lombok.extern.log4j.Log4j2;

//Araba, motora bağlıdır.
//@Data
//@AllArgsConstructor
@NoArgsConstructor
//@Builder
@Log4j2
public class Araba {

    private Motor motor;

    public Araba(Motor motor){
        this.motor = motor;
    }

    public double getToplamFiyat(){
        double toplam = motor.getMotorFiyat() + 2500;
        return toplam;
    }
}
