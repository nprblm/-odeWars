package kyu_7;
//https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class LineNumberingTest {
    @Test
    public void basicTests() {
        assertIterableEquals(Arrays.asList(), LineNumbering.number(Arrays.asList()));
        assertIterableEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
        assertIterableEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number(Arrays.asList("", "", "", "", "")));
    }
}
