package kyu_7;
//https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramDetection {
    public static boolean isAnagram(String t, String o) {
        return Stream.of(o.toLowerCase().split("")).sorted().collect(Collectors.joining()).equals(Stream.of(t.toLowerCase().split("")).sorted().collect(Collectors.joining()));
    }
}
