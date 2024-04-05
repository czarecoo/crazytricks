package com.czareg;

public class Crazy3 {

    public static void main(String[] args) {
        int start = 2_000_000_000;
        int count = 0;

        for(float f=start;f<start+50;f++){
            count++;
        }

        System.out.println(count);
    }
}