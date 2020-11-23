package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapStringObjectPrint {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", 56L);
        map.put("Food", '3');
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for (Map.Entry<String, Object> pairs : map.entrySet()) {
            String key = pairs.getKey();
            Object value = pairs.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
