package kyu_6;
//https://www.codewars.com/kata/523f5d21c841566fde000009/train/java

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());

        aList.removeAll(bList);
        int[] result = new int[aList.size()];

        for (int i = 0; i < aList.size(); i++) {
            result[i] = aList.get(i);
        }
        return result;
    }

}
