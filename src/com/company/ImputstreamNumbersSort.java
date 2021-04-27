package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImputstreamNumbersSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Integer> numbers = new ArrayList<>();

        FileInputStream in = new FileInputStream(fileName);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String figures = reader1.readLine();

            if (figures == null) {
                break;
            }

            int figuresInt = Integer.parseInt(figures);

            if (figuresInt % 2 == 0) {
                numbers.add(figuresInt);
            }
        }

        Collections.sort(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        in.close();
        reader.close();
        reader1.close();

    }
}
