package com.company;

import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int i = m;
        int j = n;

        for (i = 1; i <= m; ++i) {

            for (j = 1; j < n; ++j) {
                System.out.print("8");
            }
            System.out.println("8");
        }
    }
}
