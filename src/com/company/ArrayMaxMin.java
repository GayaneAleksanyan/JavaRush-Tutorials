package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] figures= getInts();
        int maximum = figures[0];
        int minimum = figures[0];

        for (int i = 0; i < figures.length; i++) {
            if (figures[i] > maximum) {
                maximum = figures[i];
            }
            if (figures[i] < minimum) {
                minimum = figures[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] figures = new int[20];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = Integer.parseInt(reader.readLine());
        }
        return figures;
    }
}
