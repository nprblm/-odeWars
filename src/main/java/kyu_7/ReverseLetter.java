package kyu_7;
//https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java

public class ReverseLetter {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}
