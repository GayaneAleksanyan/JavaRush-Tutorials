package com.company;

public class Initialization {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (int) (a + f / c + b);
        System.out.println(d);

        int a1 = 15;
        int b1 = 4;
        float c1 = (float) a1 / b1;
        double d1 = a1 * 1e-3 + c1;

        System.out.println(d1);

        float f1 = (float) 128.50;
        int i = (byte) f1;
        int b2 = (byte) (i + f1);
        System.out.println(b2);

        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char) nine);

        int aa = (byte) 44;
        int bb = (short) 300;
        short cc = (short) (bb - aa);
        System.out.println(cc);

        double ddd = (short) 2.50256e2d;
        char ccc = (short) 'd';
        short s = (short) 2.22;
        int iii = 150000;
        float fff = 0.50f;
        double result = fff + (iii / ccc) - (ddd * s) - 500e-3;
        System.out.println("result: " + result);

        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float ff = (int) l++ + 10 + ++x - (float) m;
        l = (long) ff / 1000;
        System.out.println(l);

        int x1 = 32816;
        char c11 = (char) x1 ;
        System.out.println(c11);
    }
}
