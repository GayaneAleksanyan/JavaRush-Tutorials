package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapPeoplePrint {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Sidorov", "Vasya");
        map.put("Sobolev", "Ilya");
        map.put("Nikolayev", "Kostya");
        map.put("Malaxov", "Aleksey");
        map.put("Maslyakov", "Sasha");
        map.put("Gordienko", "Kolya");
        map.put("Mixaylov", "Kolya");
        map.put("Mixaylov", "Vova");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
