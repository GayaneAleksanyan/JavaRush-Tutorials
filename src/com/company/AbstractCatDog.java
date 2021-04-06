package com.company;

public class AbstractCatDog {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "Murka";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return "Bobik";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
