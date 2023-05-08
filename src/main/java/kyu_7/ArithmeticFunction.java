package kyu_7;
//https://www.codewars.com/kata/583f158ea20cfcbeb400000a/train/java

public class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        return switch (operator) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            default -> a / b;
        };
    }
}
