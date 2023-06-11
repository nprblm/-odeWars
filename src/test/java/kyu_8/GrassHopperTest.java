package kyu_8;
//https://www.codewars.com/kata/55d277882e139d0b6000005d/train/java

import static org.junit.Assert.*;

import org.junit.Test;

public class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopper.findAverage(new int[]{1}));
    }

    @Test
    public void test2() {
        assertEquals(4,
                GrassHopper.findAverage(new int[]{1, 3, 5, 7}));
    }
}