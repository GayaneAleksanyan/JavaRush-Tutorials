package com.company;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            System.out.println(e);
        }
    }
}
