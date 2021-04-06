package com.company;

public class OverloadingPrintIntegerInt {
    public static void main(String[] args) {
        print(1);
        print((Integer) 23);

    }

    public static void print(int a) {

    }

    public static void print(Integer b) {

    }
}
