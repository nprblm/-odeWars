package kyu_8;

import java.util.Arrays;

//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
public class SmallestIntegerInTheArray {

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
