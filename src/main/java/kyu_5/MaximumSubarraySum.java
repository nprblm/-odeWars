package kyu_5;
//https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java

import java.util.Arrays;

public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        if (arr.length == 0 || Arrays.stream(arr).filter(x -> x < 0).boxed().toArray().length == arr.length)
            return 0;
        int max = Arrays.stream(arr).sum();
        for (int i = 0; i < arr.length - 1; i++) {
            int num = arr[i];
            max = Math.max(num, max);
            for (int j = i + 1; j < arr.length; j++) {
                num += arr[j];
                max = Math.max(num, max);
            }
        }
        return max;
    }
}
