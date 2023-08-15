package kyu_6;
//https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WriteNumberInExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", WriteNumberInExpandedForm.expandedForm(12));
        assertEquals("40 + 2", WriteNumberInExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", WriteNumberInExpandedForm.expandedForm(70304));
    }
}