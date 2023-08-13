package kyu_8;
//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmallestIntegerInTheArrayTest {

    @Test
    public void example1(){
        int expected = 11;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{78,56,232,12,11,43});
        assertEquals(expected, actual);
    }


    @Test
    public void example2(){
        int expected = -33;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{78,56,-2,12,8,-33});
        assertEquals(expected, actual);
    }

    @Test
    public void example3(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerInTheArray.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }
}


