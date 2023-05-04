package kyu_8;
//https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java

public class AreaOrPerimeter {
    public static int areaOrPerimeter(int l, int w) {
        return l == w ? w * l : (w + l) * 2;
    }
}
