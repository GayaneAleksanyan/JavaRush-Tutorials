package com.company;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            System.out.println(42 / 0);
            int a = 42 / 0;
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e);

        }
    }
}
