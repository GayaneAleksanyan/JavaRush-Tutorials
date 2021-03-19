package com.company;

import java.util.ArrayList;

public class ArrayListOfArrays {
    public static void main(String[] args) {
        java.util.ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static java.util.ArrayList<String>[] createList() {

        java.util.ArrayList<String>[] arrays = new java.util.ArrayList[3];

        arrays[0] = new java.util.ArrayList<>();
        arrays[1] = new java.util.ArrayList<>();
        arrays[2] = new java.util.ArrayList<>();

        arrays[0].add("лист первый, строка первая");
        arrays[1].add("лист второй, строка первая");
        arrays[2].add("лист второй, строка вторая");

        return arrays;
    }

    public static void printList(java.util.ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
