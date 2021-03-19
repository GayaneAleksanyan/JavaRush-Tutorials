package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToMap {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        java.util.ArrayList<String> words = new java.util.ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int count;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
                result.put(list.get(i), count);
            }
        }

        return result;
    }
}
