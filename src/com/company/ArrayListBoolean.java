package com.company;

import java.util.ArrayList;

public class ArrayListBoolean {
    public static void main(String[] args) {
        java.util.ArrayList<String> strings = new java.util.ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static java.util.ArrayList<String> fix(java.util.ArrayList<String> strings) {
        String r = "р";
        String l = "л";

        java.util.ArrayList<String> result = new ArrayList<>();
        for (String string : strings) {
            boolean isR = string.contains(r);
            boolean isL = string.contains(l);
            if (isR && !isL) {
                continue;
            }
            if (!isR && isL) {
                result.add(string);
            }
            result.add(string);
        }
        return result;
    }
}
