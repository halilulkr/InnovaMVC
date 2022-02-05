package com.patika.software.principle.aggregation;

public class AggregationMainTest {
    public static void main(String[] args) {

        Araba araba = new Araba(new Motor());
        System.out.println(araba.getToplamFiyat());
    }
}
