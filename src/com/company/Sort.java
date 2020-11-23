package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        for (int i = 0; i < 3;i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int j =2; j >= 0;j--)
            System.out.print(a[j] + " ");
    }
}
