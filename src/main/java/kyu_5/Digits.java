package kyu_5;
//https://www.codewars.com/kata/638b042bf418c453377f28ad/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Digits {
    private static List<Integer> numbersIsAvailable = new ArrayList<>();
    private static List<Integer> numbersIsNotAvailable = new ArrayList<>();
    private static int[] finalCode = new int[]{-1, -1, -1, -1};
    private static int num = -1;
    private static boolean isFirst = true;
    private static int numbersSum = 0;
    private static int iterator = 0;
    private static List<Integer> indexIsAvailable = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
    private static int index = 0;

    private static boolean isEnd = false;

    static int[] tryToGuess(int m) {
        int matches = m;
        if (isEnd) {
            numbersIsAvailable = new ArrayList<>();
            numbersIsNotAvailable = new ArrayList<>();
            finalCode = new int[]{-1, -1, -1, -1};
            num = -1;
            isFirst = true;
            numbersSum = 0;
            iterator = 0;
            indexIsAvailable = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
            isEnd = false;
            matches = -1;
            index = 0;
        }
        if (numbersSum <= 9) {
            if (matches != -1) {
                if (matches == 0) {
                    numbersIsNotAvailable.add(num);
                } else {
                    numbersIsAvailable.add(num);
                }
                numbersSum++;
            }
            if (numbersIsNotAvailable.size() == 6 && numbersIsAvailable.size() < 4) {
                num++;
                for (int i = num; i <= 9; i++) {
                    numbersIsAvailable.add(i);
                    numbersSum++;
                }
            }
            if (numbersIsAvailable.size() == 4 && numbersIsNotAvailable.size() < 6) {
                num++;
                for (int i = num; i <= 9; i++) {
                    numbersIsNotAvailable.add(i);
                    numbersSum++;
                }
            }
            if (numbersIsAvailable.size() < 4) {
                num++;
                return new int[]{num, num, num, num};
            }

        }
        if (numbersSum == 10) {
            if (numbersIsAvailable.size() == 0) {
                return finalCode;
            } else {
                int[] returnCode = new int[]{numbersIsNotAvailable.get(1), numbersIsNotAvailable.get(1), numbersIsNotAvailable.get(1), numbersIsNotAvailable.get(1)};
                if (isFirst) {
                    iterator = indexIsAvailable.get(0);
                    isFirst = false;
                } else {
                    if (matches == 0) {
                        index = index + 1 >= indexIsAvailable.size() ? 0 : index + 1;
                        iterator = indexIsAvailable.get(index);
                        if (iterator == indexIsAvailable.get(indexIsAvailable.size() - 1)) {
                            finalCode[indexIsAvailable.get(indexIsAvailable.size() - 1)] = numbersIsAvailable.get(0);
                            indexIsAvailable.remove(indexIsAvailable.size() - 1);
                            numbersIsAvailable.remove(0);
                            iterator = indexIsAvailable.get(0);
                            index = 0;
                            if (numbersIsAvailable.size() == 1) {
                                finalCode[indexIsAvailable.get(0)] = numbersIsAvailable.get(0);
                                isEnd = true;
                                return finalCode;
                            }
                        }

                    } else {
                        index = 0;
                        if (numbersIsAvailable.size() == 2) {
                            finalCode[iterator] = numbersIsAvailable.get(0);
                            indexIsAvailable.remove(new Integer(iterator));
                            numbersIsAvailable.remove(0);
                            iterator = indexIsAvailable.get(index);
                            finalCode[iterator] = numbersIsAvailable.get(0);
                            isEnd = true;
                            return finalCode;
                        }
                        finalCode[iterator] = numbersIsAvailable.get(0);
                        numbersIsAvailable.remove(0);
                        indexIsAvailable.remove(new Integer(iterator));
                        iterator = indexIsAvailable.get(0);

                    }
                }
                returnCode[iterator] = numbersIsAvailable.get(0);
                return returnCode;
            }
        }
        return new int[]{9, 9, 9, 9};
    }
}