package kyu_6;
//https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/train/java

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String[] word = str.split("");
            if (word[i].equals(" "))
                continue;
            word[i] = word[i].toUpperCase();
            result.add(String.join("", word));

        }
        return result.toArray(new String[0]);
    }
}
