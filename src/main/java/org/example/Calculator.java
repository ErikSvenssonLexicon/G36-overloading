package org.example;

public class Calculator {

    public static double add(double d1, double d2){
        System.out.println("Calling public static double add(double d1, double d2)");
        return d1 + d2;
    }

    public static double add(Number number1, Number number2){
        System.out.println("public static double add(Number number1, Number number2)");
        return number1.doubleValue() + number2.doubleValue();
    }

    public static int add(int number1, int number2){
        System.out.println("Calling public static int add(int number1, int number2)");
        return number1 + number2;
    }

    public static String add(Object o1, Object o2){
        System.out.println("public static String add(Object o1, Object o2)");
        return add(o1.toString(), o2.toString());
    }

    public static String add(String s1, String s2){
        System.out.println("public static String add(String s1, String s2)");
        return Integer.parseInt(s1) + Integer.parseInt(s2)+"";
    }

}
