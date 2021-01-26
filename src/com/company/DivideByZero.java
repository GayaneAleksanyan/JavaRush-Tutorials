package com.company;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (java.lang.ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static void divideByZero() {
        int a = 42 / 0;
        System.out.println(a);
    }
}
