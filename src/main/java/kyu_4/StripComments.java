package kyu_4;
//https://www.codewars.com/kata/51c8e37cee245da6b40000bd/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        return Arrays.stream(text.split("\n")).map(s -> {
            for (String symbol : commentSymbols) s = s.replaceAll("(\\s+$)|(\\s*["+symbol+"].*)","");
            return s;
        }).collect(Collectors.joining("\n"));
    }

}
