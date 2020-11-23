package com.company;

public class Cats {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 2, 5, 12);
        Cat cat2 = new Cat("Vaska", 3, 4, 10);
        Cat cat3 = new Cat("Besik", 1, 1, 5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
