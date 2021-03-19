package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListIndexOfValue {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        int a;
        try {
            a = list.get(index);
        } catch (Exception e) {
            a = defaultValue;
        }
        return a;
    }
}
