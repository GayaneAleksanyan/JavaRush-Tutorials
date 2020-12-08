package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapNamesCount {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Sidorov", "Aleksey");
        map.put("Mamayev", "Aleksandr");
        map.put("Petrov", "Misha");
        map.put("Burdashev", "Aleksandr");
        map.put("Ivanov", "Ivan");
        map.put("Putin", "Kirill");
        map.put("Antonov", "Anton");
        map.put("Kirrilenko", "Aleksey");
        map.put("Aleksandrov", "Ivan");
        map.put("Mixaylenko", "Anna");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String nameTemp : map.values()) {
            if (nameTemp.equals(name)) {
                count++;
            }
        } return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count1 = 0;
        for (String lastNameTemp : map.keySet()) {
            if (lastNameTemp.equals(lastName)) {
                count1++;
            }
        } return count1;
    }

    public static void main(String[] args) {

    }
}
