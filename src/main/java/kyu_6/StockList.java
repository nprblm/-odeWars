package kyu_6;
//https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/java

import java.util.Arrays;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOf1stLetter == null || lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";
        StringBuilder result = new StringBuilder();
        for (String letter : lstOf1stLetter) {
            int number = Arrays.stream(lstOfArt).filter(x -> x.startsWith(letter)).map(x -> x.replaceAll("[^0-9]", "")).mapToInt(Integer::parseInt).sum();
            result.append(String.format("(%s : %d)   ", letter, number));
        }
        return result.toString().trim().replaceAll("   ", " - ");
    }
}
