package kyu_6;
//https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class YourOrderPleaseTest {
    @Test
    public void test1() {
        assertThat(YourOrderPlease.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        assertThat(YourOrderPlease.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        assertThat("Empty input should return empty string", YourOrderPlease.order(""), equalTo(""));
    }
}