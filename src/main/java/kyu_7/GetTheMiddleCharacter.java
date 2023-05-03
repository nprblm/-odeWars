package kyu_7;
//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        return word.substring(word.length() / 2 - (word.length() % 2 == 0 ? 1 : 0), word.length() / 2 + 1);
    }
}
