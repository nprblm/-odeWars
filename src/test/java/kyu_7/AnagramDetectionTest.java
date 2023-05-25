package kyu_7;
//https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramDetectionTest {
    @Test
    public void exampleTests() {
        AnagramDetection k = new AnagramDetection();

        assertEquals(true, k.isAnagram("foefet", "toffee"));
        assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, k.isAnagram("Twoo", "Woot"));
        assertEquals(false, k.isAnagram("apple", "pale"));
    }
}