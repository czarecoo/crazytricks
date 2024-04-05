package com.czareg;

public class Crazy10 {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        int[] a = receiver.method1();
        int b[] = receiver.method2();
        int[] c = receiver.method1();
    }

    static class Receiver {
        public int[] method1() {
            return new int[]{1};
        }

        public int method2()[] {
            return new int[]{1};
        }
    }
}