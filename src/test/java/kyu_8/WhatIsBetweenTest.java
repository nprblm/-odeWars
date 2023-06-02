package kyu_8;
//https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class WhatIsBetweenTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, WhatIsBetween.between(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, WhatIsBetween.between(-2, 2));
    }
}