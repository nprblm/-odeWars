package kyu_8;
//https://www.codewars.com/kata/5547929140907378f9000039/train/java


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelRemoverTest {
    @Test
    void test1() {
        assertEquals("hll", VowelRemover.shortcut("hello"));
        assertEquals("hw r y tdy?", VowelRemover.shortcut("how are you today?"));
        assertEquals("cmpln", VowelRemover.shortcut("complain"));
        assertEquals("nvr", VowelRemover.shortcut("never"));
        assertEquals("HELLO", VowelRemover.shortcut("HELLO"));
    }
}
