package com.czareg;

import java.math.BigDecimal;

public class Crazy6 {

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("0.25");
        BigDecimal bigDecimal2 = new BigDecimal(0.25);

        System.out.println(bigDecimal1.equals(bigDecimal2));


        bigDecimal1 = new BigDecimal("0.1");
        bigDecimal2 = new BigDecimal(0.1);

        System.out.println(bigDecimal1.equals(bigDecimal2));
    }
}