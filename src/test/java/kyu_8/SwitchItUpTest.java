package kyu_8;
//https://www.codewars.com/kata/5808dcb8f0ed42ae34000031/train/java

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwitchItUpTest {
    @Test
    public void basicTests() {
        assertEquals("One", SwitchItUp.switchItUp(1));
        assertEquals("Three", SwitchItUp.switchItUp(3));
        assertEquals("Five", SwitchItUp.switchItUp(5));
    }
}