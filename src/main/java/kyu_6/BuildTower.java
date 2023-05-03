package kyu_6;
//https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java

public class BuildTower {

    public static String[] towerBuilder(int nFloors) {
        String[] solution = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            solution[i] = " ".repeat(nFloors - 1 - i) + "*".repeat(1 + i * 2) + " ".repeat(nFloors - 1 - i);
        }
        return solution;
    }


}
