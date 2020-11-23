package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListDV {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        java.util.ArrayList<String> list = new java.util.ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            list.add(string);
        }

        java.util.ArrayList<String> result = doubleValues(list);

        for (String string : result) {
            System.out.println(string);
        }
    }

    public static java.util.ArrayList<String> doubleValues(java.util.ArrayList<String> strings) {
        java.util.ArrayList<String> result = new ArrayList<>();

        for (String string : strings) {
            result.add(string);
            result.add(string);
        }
        return result;
    }
}
