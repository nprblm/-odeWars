package kyu_8;
//https://www.codewars.com/kata/5b853229cfde412a470000d0/train/java

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TwiceAsOldTest {
    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld.twiceAsOld(30, 0));
        assertEquals(16, TwiceAsOld.twiceAsOld(30, 7));
        assertEquals(15, TwiceAsOld.twiceAsOld(45, 30));

    }
}
