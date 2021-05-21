package com.countMoney;

public abstract class Money {


    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

//    public abstract double getAmount();

    public abstract String getCurrencyName();
}

