package kyu_7;
//https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseLetterTest {
    @Test
    public void testSomething() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }

    private void doTest(final String str, final String expected) {
        assertEquals(expected, ReverseLetter.reverseLetter(str));
    }
}
