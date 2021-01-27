package com.company;

import java.util.ArrayList;

public class ListOfArrays {
    public static void main(String[] args) {
        java.util.ArrayList<int[]> list = createList();
        printList(list);
    }

    public static java.util.ArrayList<int[]> createList() {
        java.util.ArrayList<int[]> list = new java.util.ArrayList<>();
        list.add(new int[] {1, 2, 3, 4, 5});
        list.add(new int[] {1, 2});
        list.add(new int[] {1, 2, 3, 4});
        list.add(new int[] {1, 2, 3,4 ,5, 6, 7});
        list.add(new int[0]);

        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
