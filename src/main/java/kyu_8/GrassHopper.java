package kyu_8;

import java.util.Arrays;

//https://www.codewars.com/kata/55d277882e139d0b6000005d/train/java
public class GrassHopper {
    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).sum()/ nums.length;
    }
}
