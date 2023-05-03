package kyu_6;
//https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k <= 0)
            return "";
        String longest = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder str = new StringBuilder(strarr[i]);
            for (int j = 1; j < k; j++) {
                str.append(strarr[i + j]);
            }
            if (longest.length() < str.length())
                longest = str.toString();
        }
        return longest;
    }
}
