package com.company;

public class InterfaceDreanDesire {
    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    public interface Desire {
    }

    public interface Dream {
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
