package com.company;

public class CharToString {
    public static void main(String[] args) {
        String line = "организация объединённых наций";
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(new String(chars));
    }
}
