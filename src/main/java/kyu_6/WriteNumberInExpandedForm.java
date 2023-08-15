package kyu_6;
//https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java

import java.util.ArrayList;
import java.util.List;

public class WriteNumberInExpandedForm {

    public static String expandedForm(int num) {
        String[] number = String.valueOf(num).split("");
        List<String> result = new ArrayList<>();
        for (var i = 0; i < number.length; i++) {
            if (!number[i].equals("0"))
                result.add(number[i] + "0".repeat(number.length - i - 1));
        }
        return String.join(" + ", result);
    }
}
