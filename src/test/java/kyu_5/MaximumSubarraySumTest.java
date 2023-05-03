package kyu_5;
//https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarraySumTest {

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaximumSubarraySum.sequence(new int[]{}));
    }

    @Test
    public void testExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6", 6, MaximumSubarraySum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void testNegativeExampleArray() throws Exception {
        assertEquals("Example negative array should have a max of 0", 0, MaximumSubarraySum.sequence(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));
    }
}
