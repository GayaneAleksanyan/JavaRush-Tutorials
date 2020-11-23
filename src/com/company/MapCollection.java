package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> plants = new HashMap<String, String>();
        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");

        for (Map.Entry<String, String> pairs : plants.entrySet()) {

            String key = pairs.getKey();
            String value = pairs.getValue();

            System.out.println(key + " - " + value);

        }
    }
}
