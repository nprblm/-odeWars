package kyu_5;
//https://www.codewars.com/kata/559a28007caad2ac4e000083/train/java

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        ArrayList<BigInteger> fibonacciList = new ArrayList<>(Arrays.asList(BigInteger.valueOf(1), BigInteger.valueOf(1)));
        for (int i = 2; i < n.intValue() + 1; i++)
            fibonacciList.add(fibonacciList.get(i - 1).add(fibonacciList.get(i - 2)));
        return n.intValue() < 3 ? BigInteger.valueOf(n.intValue() * 4L) : fibonacciList.stream().reduce(BigInteger.ZERO, BigInteger::add).multiply(BigInteger.valueOf(4));
    }
}