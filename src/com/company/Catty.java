package com.company;

public class Catty {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public void initialize (String name) {
        this.name = name;
        this.age = 2;
        this.weight = 3;
        this.address = null;
        this.color = "black";
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "brown";
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.address = null;
        this.weight = 5;
        this.color = "white";
    }

    public void initialize (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 5;
    }

    public void initialize (int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 10;
    }
}
