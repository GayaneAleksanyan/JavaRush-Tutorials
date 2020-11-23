package com.company;

public class CatCountStatic {
    private static int catCount = 0;

    public CatCountStatic() {
        catCount++;
    }

    public static int getCatCount() {
        CatCountStatic.setCatCount(catCount);
        return catCount;
    }

    public static void setCatCount(int catCount) {
        CatCountStatic.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}
