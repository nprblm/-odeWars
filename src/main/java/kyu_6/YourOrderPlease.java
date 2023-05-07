package kyu_6;
//https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

import java.util.Arrays;
import java.util.List;

public class YourOrderPlease {
    public static String order(String words) {
        if (words == null || words.equals(""))
            return "";
        List<String> list = Arrays.asList(words.split(" "));
        String[] result = new String[list.size()];
        for (String str : list) {
            result[Integer.parseInt(str.replaceAll("[a-zA-Z]", "")) - 1] = str;
        }
        return String.join(" ", result);
    }
}