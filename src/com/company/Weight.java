package com.company;

public class Weight {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double a;
        a = earthWeight*0.17;
        return a;
    }
}
