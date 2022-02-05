package com.patika.software.principle.aggregation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//Motor, arabaya bağlı değildir.
@Data
@AllArgsConstructor
//@NoArgsConstructor
@Builder
@Log4j2
public class Motor {

    private double motorFiyat;
    private String motorGuc;

    public Motor(){
        this.motorFiyat = 3162.31;
    }

    public double getMotorFiyat(){
        return this.motorFiyat;
    }
}
