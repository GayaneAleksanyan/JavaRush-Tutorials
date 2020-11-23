package com.company;

public class ClosestToTen {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int c = abs(a - 10);
        int d = abs(b - 10);
        if (c < d) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
