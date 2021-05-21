package com.labels;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.2, "kuku");
        labels.put(2.1, "ukuk");
        labels.put(3.1, "mumu");
        labels.put(1.3, "umum");
        labels.put(4.1, "aaaa");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
