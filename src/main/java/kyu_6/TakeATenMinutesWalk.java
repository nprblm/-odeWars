package kyu_6;
//https://www.codewars.com/kata/54da539698b8a2ad76000228

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeATenMinutesWalk {
    public static boolean isValid(char[] walk) {
        String str = Stream.of(walk).map(String::valueOf).collect(Collectors.joining());
        return (walk.length == 10) &&
                (str.replace("n", "").length() == str.replace("s", "").length()) &&
                (str.replace("w", "").length() == str.replace("e", "").length());
    }
}

