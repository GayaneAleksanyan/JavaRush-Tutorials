package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortMaxtoMin {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int[] z = {a, b, c, d, e};

        for (int i = 0; i < z.length; i++) {
            int min = z[i];
            int min_i = i;

            for (int j = i + 1; j < z.length; j++) {
                if (z[j] < min) {
                    min = z[j];
                    min_i = j;
                }
            }

//            if (i != min_i) {
            int tmp = z[i];
            z[i] = z[min_i];
            z[min_i] = tmp;
//            }
        }

        System.out.println(z[0]);
        System.out.println(z[1]);
        System.out.println(z[2]);
        System.out.println(z[3]);
        System.out.println(z[4]);

    }
}
