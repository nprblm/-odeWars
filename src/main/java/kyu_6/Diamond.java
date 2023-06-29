package kyu_6;

//https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
public class Diamond {
    public static String print(int n) {
        if (n <= 0 || n % 2 == 0)
            return null;
        StringBuilder result = new StringBuilder();
        int spaces = (n - 1) / 2;
        int stars = 1;
        for (int i = 0; i < (n - 1) / 2; i++) {
            result.append(" ".repeat(spaces)).append("*".repeat(stars)).append("\n");
            spaces--;
            stars += 2;
        }
        result.append("*".repeat(n)).append("\n");
        spaces++;
        stars -= 2;
        for (int i = 0; i < (n - 1) / 2; i++) {
            result.append(" ".repeat(spaces)).append("*".repeat(stars)).append("\n");
            spaces++;
            stars -= 2;
        }
        return result.toString();
    }
}