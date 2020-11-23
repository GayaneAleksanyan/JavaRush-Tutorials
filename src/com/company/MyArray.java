package com.company;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) throws Exception {

        String[] myArray;
        myArray = new String[10];

        for (int i = 0; i < myArray.length - 2; i++) {
            Scanner scanner = new Scanner(System.in);
            myArray[i] = scanner.nextLine();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}
