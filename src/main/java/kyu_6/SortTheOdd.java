package kyu_6;
//https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        List<Integer> odd = Arrays.stream(array).filter(x -> x % 2 != 0).sorted().boxed().collect(Collectors.toList());
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = odd.get(0);
                odd.remove(0);
            }
        }
        return array;
    }
}
