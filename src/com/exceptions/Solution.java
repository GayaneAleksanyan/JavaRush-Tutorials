package com.exceptions;

import javax.naming.NamingException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        exceptions.add(new NoSuchFieldException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new NullPointerException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new NoSuchMethodException());
        exceptions.add(new NamingException());
    }
}
