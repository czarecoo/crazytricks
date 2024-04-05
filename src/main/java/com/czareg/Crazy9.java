package com.czareg;

public class Crazy9 {

    public static void main(String[] args) {
        new Receiver().method(5);
    }

    static class Receiver {
        public int method(Receiver this, int number) {
            return number;
        }
    }
}