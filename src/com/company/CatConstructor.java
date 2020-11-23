package com.company;

public class CatConstructor {
    public class Cat {
        String name;
        int age;
        int weight;
        String address;
        String color;

        public Cat(String name) {
            this.name = name;
            this.age = 2;
            this.weight = 3;
            this.address = null;
            this.color = "white";
        }

        public Cat(String name, int weight, int age) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.address = null;
            this.color = "black";
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
            this.weight = 5;
            this.address = null;
            this.color = "brown";
        }

        public Cat(int weight, String color) {
            this.name = null;
            this.age = 13;
            this.weight = weight;
            this.address = null;
            this.color = color;
        }

        public Cat(int weight, String color, String address) {
            this.name = null;
            this.age = 5;
            this.weight = 12;
            this.address = address;
            this.color = color;
        }

    }

    public static void main(String[] args) {

    }
}
