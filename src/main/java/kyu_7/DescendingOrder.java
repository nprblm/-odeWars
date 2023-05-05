package kyu_7;
//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(new StringBuilder().append(Stream.of(String.valueOf(num).split("")).sorted().collect(Collectors.joining())).reverse().toString());
    }
}
