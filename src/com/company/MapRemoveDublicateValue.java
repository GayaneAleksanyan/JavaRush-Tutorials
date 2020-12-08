package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveDublicateValue {
    public static Map<String, String> createMap() {

        Map<String, String> map = new HashMap<String, String>();

        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Sidorov", "Kolya");
        map.put("Malaxov", "Aleksey");
        map.put("Andropov", "Vasya");
        map.put("Kirrilenko", "Kolya");
        map.put("Mustafayev", "Mustafa");
        map.put("Ernst", "Kostya");
        map.put("Murugov", "Slava");
        map.put("Gordienko", "Aleksey");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (String name : copy.values()) {
            int count = 0;
            for (String nameTemp : map.values()) {
                if (nameTemp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
