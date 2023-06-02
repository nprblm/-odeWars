package kyu_8;
//https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java

import java.util.stream.IntStream;
public class WhatIsBetween {
    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a,b).toArray();
    }
}
