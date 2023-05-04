package kyu_8;
//https://www.codewars.com/kata/5547929140907378f9000039/train/java

public class VowelRemover {
    public static String shortcut(String input) {
        return input.replaceAll("[aouei]","");
    }
}
