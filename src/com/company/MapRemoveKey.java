package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveKey {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 500);
        map.put("Petrov", 400);
        map.put("Sidorov", 200);
        map.put("Maslyakov", 200);
        map.put("Gercmann", 700);
        map.put("Smith", 800);
        map.put("Mixaylenko", 500);
        map.put("Pankratov", 900);
        map.put("Belyaev", 400);
        map.put("Shults", 800);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet() ) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
