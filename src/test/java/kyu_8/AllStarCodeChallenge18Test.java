package kyu_8;
//https://www.codewars.com/kata/5865918c6b569962950002a1/train/java

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllStarCodeChallenge18Test {
    @Test
    public void testSomething() {
        assertEquals(1, AllStarCodeChallenge18.strCount("Hello", 'o'));
        assertEquals(2, AllStarCodeChallenge18.strCount("Hello", 'l'));
        assertEquals(0, AllStarCodeChallenge18.strCount("", 'z'));
    }
}