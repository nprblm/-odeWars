package kyu_6;
//https://www.codewars.com/kata/54da539698b8a2ad76000228

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TakeATenMinutesWalkTest {
    @Test
    public void Test() {
        assertEquals("Should return true", true, TakeATenMinutesWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertEquals("Should return false", false, TakeATenMinutesWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertEquals("Should return false", false, TakeATenMinutesWalk.isValid(new char[]{'w'}));
        assertEquals("Should return false", false, TakeATenMinutesWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}