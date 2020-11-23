package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhileBreakSum {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("сумма"))
                break;
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
