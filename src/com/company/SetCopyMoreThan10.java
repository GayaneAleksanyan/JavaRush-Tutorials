package com.company;

import java.util.HashSet;
import java.util.Set;

public class SetCopyMoreThan10 {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(34);
        set.add(8);
        set.add(90);
        set.add(9);
        set.add(76);
        set.add(7);
        set.add(80);
        set.add(0);
        set.add(2);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(6);
        set.add(11);
        set.add(55);
        set.add(98);
        set.add(67);
        set.add(45);
        set.add(35);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        for (Integer figure : copy) {
            if (figure > 10) {
                set.remove(figure);
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
