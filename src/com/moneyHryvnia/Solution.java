package com.moneyHryvnia;

/* 
ООП. Hryvnia — тоже деньги
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    public static class Hryvnia extends Money {
        private double amount = 123d;

        public Hryvnia getMoney() {
            return this;
        }

        @Override
        public Object getAmount() {
            return amount;
        }
    }
}
