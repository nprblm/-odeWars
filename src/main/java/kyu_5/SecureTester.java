package kyu_5;
//https://www.codewars.com/kata/526dbd6c8c0eb53254000110/train/java

import java.util.regex.Pattern;

public class SecureTester{
    public static boolean alphanumeric(String s){
        return Pattern.compile("[0-9a-zA-Z]+").matcher(s).matches();
    }

}
