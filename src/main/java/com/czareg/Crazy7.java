package com.czareg;

import java.util.stream.Stream;

public class Crazy7 {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        boolean result = empty.allMatch(str -> str.length() > 7);
        System.out.println(result);
    }
}