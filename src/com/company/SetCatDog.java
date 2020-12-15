package com.company;

import java.util.HashSet;
import java.util.Set;

public class SetCatDog {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result1 = new HashSet<Dog>();

        result1.add(new Dog());
        result1.add(new Dog());
        result1.add(new Dog());

        return result1;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> set = new HashSet<>();
        set.addAll(cats);
        set.addAll(dogs);
        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object print : pets) {
            System.out.println(print);
        }

    }

    public static class Cat {

    }

    public static class Dog {

    }
}
