package com.variousPrimitives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        double d;
        short sh;
        int i;

        while (!(s = reader.readLine()).equals("exit")) {
            try {
                if (s.contains(".")) {
                    d = Double.parseDouble(s);
                    print(d);
                } else if ((i = Integer.parseInt(s)) < 1 || ((i = Integer.parseInt(s)) > 127)) {
                    print(i);
                } else if ((sh = Short.parseShort(s)) > 0 && ((sh = Short.parseShort(s)) < 128)) {
                    print(sh);
                } else {
                    print(s);
                }
            } catch (NumberFormatException e) {
                print(s);
            }
        } reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}