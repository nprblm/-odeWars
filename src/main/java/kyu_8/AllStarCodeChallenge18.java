package kyu_8;
//https://www.codewars.com/kata/5865918c6b569962950002a1/train/java

public class AllStarCodeChallenge18 {
    public static int strCount(String str, char letter) {
        return str.length() - str.replaceAll(String.valueOf(letter), "").length();
    }
}
