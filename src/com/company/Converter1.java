package com.company;

public class Converter1 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 1.5));
        System.out.println(convertEurToUsd(150, 1.5));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;

    }
}
