package kyu_6;
//https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DetectPangram {
    public boolean check(String sentence) {
        return Stream.of(sentence.replaceAll("[^a-zA-Z]", "").toLowerCase().split("")).distinct().sorted().collect(Collectors.joining()).equals("abcdefghijklmnopqrstuvwxyz");
    }
}
