package com.czareg;

import java.util.Objects;

public class Crazy8 {

    public static void main(String[] args) {
        System.out.println(Objects.equals(Integer.valueOf(0123).intValue(), 0123));
        System.out.println(Objects.equals(Integer.valueOf(0123).intValue(), 83));
        System.out.println(Objects.equals(Integer.valueOf("0123").intValue(), 83));
    }
}