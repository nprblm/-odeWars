package kyu_8;
//https://www.codewars.com/kata/568dcc3c7f12767a62000038/java

public class Alarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}
