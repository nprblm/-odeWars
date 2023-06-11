package kyu_8;

import java.util.Arrays;

//https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java
public class YouOnlyNeedOneBeginner {

    public static boolean check(Object[] a, Object x) {
        return !(Arrays.stream(a).filter(y -> y.equals(x)).toArray().length==0);
    }
}
