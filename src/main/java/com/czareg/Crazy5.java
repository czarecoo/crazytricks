package com.czareg;

public class Crazy5 {

    public static void main(String[] args) {
        double zero =0.0;
        System.out.println(zero < Integer.MIN_VALUE);
        System.out.println(zero < Double.MIN_VALUE);
        System.out.println(zero < Double.NEGATIVE_INFINITY);
    }
}