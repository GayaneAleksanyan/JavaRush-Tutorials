package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Sol {
/*
Поправочки нужны
*/
        HashMap<Integer, String> map;
        static Integer index;
        static String name;

        public Sol() {
            this.map = new HashMap<Integer, String>();
        }

        public static void main(String[] args) throws IOException {
            Sol solution = new Sol();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 10; i++) {
                int index = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                solution.map.put(index, name);
            }

            for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
                index = pair.getKey();
                name = pair.getValue();
                System.out.println("Id=" + index + " Name=" + name);
            }
        }
    }
