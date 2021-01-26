package com.company;

public class Statics {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Statics solution = new Statics();
        solution.A = 5;

        Statics.D = 5;
    }

    public int getA() {
        return A;
    }
}
