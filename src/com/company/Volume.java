package com.company;

public class Volume {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        return a * b * c * 1000;
    }
}
