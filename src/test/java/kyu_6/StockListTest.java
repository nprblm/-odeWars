package kyu_6;
//https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/java

import static org.junit.Assert.*;
import org.junit.Test;

public class StockListTest {

    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)",
                StockList.stockSummary(art, cd));
    }
}
