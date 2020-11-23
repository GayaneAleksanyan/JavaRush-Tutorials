package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDivision {
    public static void main(String[] args) throws Exception {
        java.util.ArrayList<Integer> wholeList = new java.util.ArrayList<Integer>(20);
        java.util.ArrayList<Integer> dividesToThree = new java.util.ArrayList<Integer>();
        java.util.ArrayList<Integer> dividesToTwo = new java.util.ArrayList<Integer>();
        java.util.ArrayList<Integer> theRest = new java.util.ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            wholeList.add(scanner.nextInt());
        }

        for (int i = 0; i < wholeList.size(); i++) {
            int z = wholeList.get(i);
            if (z % 3 == 0 && z % 2 == 0) {
                dividesToThree.add(z);
                dividesToTwo.add(z);
            } else if (z % 3 == 0) {
                dividesToThree.add(z);
            } else if (z % 2 == 0) {
                dividesToTwo.add(z);
            } else {
                theRest.add(z);
            }
        }
        printList(dividesToThree);
        printList(dividesToTwo);
        printList(theRest);
    }

    public static void printList(ArrayList<Integer> wholeList) {
        for (Integer x : wholeList) {
            System.out.println(x);
        }
    }
}
