package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapUniqueKey {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());

                String name = reader.readLine();

                if (name.length() == 0) {
                    name.equals(null);
                }

                for (Map.Entry<String, Integer> string : map.entrySet()) {
                    if (string.getKey().equals(name)) {
                        throw new IllegalArgumentException();
                    }
                }

                map.put(name, id);
            } catch (IllegalArgumentException e) {
                break;
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            int value = pair.getValue();

            System.out.println(value + " " + key);
        }
    }
}
