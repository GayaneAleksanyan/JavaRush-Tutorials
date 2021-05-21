package com.castedDoubleFloat;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь четыре ошибки
*/

public class Solution {

    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);
    }

    public static void initList(List<Number> list) {
        list.add(1000.0);
        list.add(new Double("123e-445632"));
        list.add((float) (-90 / -3));
        list.remove(new Double("123e-445632"));
    }

    public static void printListValues(List<Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}
