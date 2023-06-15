package kyu_6;
//https://www.codewars.com/kata/52efefcbcdf57161d4000091/train/java


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharactersInYourString {
    public static Map<Character, Integer> count(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
    }
}
