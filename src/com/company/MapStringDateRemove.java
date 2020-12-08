package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MapStringDateRemove {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 1 2012"));
        map.put("Петров", dateFormat.parse("JULY 1 2012"));
        map.put("Сидоров", dateFormat.parse("AUGUST 1 2012"));
        map.put("Кириенко", dateFormat.parse("APRIL 1 2012"));
        map.put("Бурдашев", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Масляков", dateFormat.parse("MARCH 1 2012"));
        map.put("Гусман", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Джобс", dateFormat.parse("JANUARY 1 2012"));
        map.put("Гейтс", dateFormat.parse("DECEMBER 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}
