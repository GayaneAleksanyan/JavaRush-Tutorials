package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MySolution {
    public static void main(String[] args) throws Exception {
        java.util.ArrayList<String> list = new java.util.ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(reader.readLine());
        }

        doubleValues(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void doubleValues(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.add(i, list.get(i));
            }
        }
    }
}

