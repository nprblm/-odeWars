package kyu_6;
//https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildTowerTest {

    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", BuildTower.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.towerBuilder(3)));
    }

}
