package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CatMap {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<>();
        cats.put("Murka", new Cat("murka"));
        cats.put("M", new Cat("m"));
        cats.put("Mu", new Cat("mu"));
        cats.put("Mur", new Cat("mur"));
        cats.put("Murk", new Cat("murk"));
        cats.put("Muka", new Cat("muka"));
        cats.put("Mrka", new Cat("mrka"));
        cats.put("Mura", new Cat("mura"));
        cats.put("Murka1", new Cat("murka1"));
        cats.put("Murka2", new Cat("murka2"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
