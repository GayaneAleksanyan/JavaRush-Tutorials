package com.company;

public class CatName {
    private String name = "безымянный кот";

    public void setName(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        CatName cat = new CatName();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
