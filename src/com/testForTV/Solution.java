package com.testForTV;

public class Solution {
    public static void main(String[] args) {

        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0 & j % 5 == 0) {
                System.out.print(j + "c" + " ");
            } else if (j % 3 == 0) {
                System.out.print(j + "a" + " ");
            } else if (j % 5 == 0) {
                System.out.print(j + "b" + " ");
            } else
                System.out.print(j + " ");
        }
    }
}
