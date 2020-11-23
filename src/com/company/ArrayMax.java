package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMax {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] initializeArray = new int[20];
        for (int i = 0; i < initializeArray.length; i++) {
            String s = reader.readLine();
            initializeArray[i] = Integer.parseInt(s);
        } return initializeArray;
    }

    public static int max(int[] array) {
        int max=array[0];
        for (int i=0; i<array.length; i++)
            if (array[i]>max) max=array[i];
        return max;

    }
}
