package kyu_8;
//https://www.codewars.com/kata/5772da22b89313a4d50012f7/train/java

public class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        return name.equals(owner)?"Hello boss":"Hello guest";
    }
}
