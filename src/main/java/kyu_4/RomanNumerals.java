package kyu_4;
//https://www.codewars.com/kata/51b66044bce5799a7f000003/train/java

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {

    public static String toRoman(int n) {
        List<Integer> list = new ArrayList<>(List.of(n / 1000, (n % 1000 - n % 100) / 100, (n % 100 - n % 10) / 10, n % 10));
        List<String> listRom = new ArrayList<>(List.of("M", "D", "C", "L", "X", "V", "I"));
        StringBuilder result = new StringBuilder(toRomanNumber(list.get(0), listRom.get(0), listRom.get(0), listRom.get(0)));

        for (int i = 1; i < list.size(); i++)
            result.append(toRomanNumber(list.get(i), listRom.get((i - 1) * 2), listRom.get((i - 1) * 2 + 1), listRom.get((i - 1) * 2 + 2)));

        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {
        List<String> list = List.of(romanNumeral.split(""));
        List<Integer> listFinal = new ArrayList<>();
        for (String str : list) {
            listFinal.add(fromRomanNumber(str));
        }
        System.out.println("list = " + list);
        System.out.println("listFinal = " + listFinal);
        int result = 0;
        for (int i = 0; i < listFinal.size(); i++) {
            if (i + 1 < listFinal.size()) {
                if (listFinal.get(i) < listFinal.get(i + 1)) {
                    result += listFinal.get(i + 1) - listFinal.get(i);
                    i++;
                } else
                    result += listFinal.get(i);

            } else {
                result += listFinal.get(i);
            }
        }
        return result;
    }

    private static String toRomanNumber(int n, String big, String middle, String low) {
        return n == 0 ? "" : (n == 9 ? (low + big) : (n == 4 ? (low + middle) : (n >= 5 ? (middle + low.repeat(n - 5)) : (low.repeat(n)))));
    }

    private static int fromRomanNumber(String n) {
        return n.equals("M") ? (1000) : (n.equals("D") ? (500) : (n.equals("C") ? (100) : (n.equals("L") ? (50) : (n.equals("X") ? (10) : (n.equals("V") ? (5) : (1))))));
    }
}
