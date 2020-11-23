package com.company;

import java.util.ArrayList;

public class Caat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Caat() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        cats.forEach((cat) -> System.out.println(cat));
    }
}
