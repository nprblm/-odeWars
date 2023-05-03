package kyu_6;
//https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java

import java.util.Arrays;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int start = 0;
        int end = Arrays.stream(arr).sum();
        for (int i = 0; i < arr.length; i++) {
            end -= arr[i];
            if (start == end)
                return i;
            start += arr[i];
        }
        return -1;
    }
}
