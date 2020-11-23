package com.company;

public class MultTable {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            i++;

            int j = 0;
            while (j < 10) {
                j++;

                System.out.print(i * j + " ");
            }
            System.out.println();

        }

    }
}
