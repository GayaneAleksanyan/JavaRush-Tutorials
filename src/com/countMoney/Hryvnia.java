package com.countMoney;

public class Hryvnia extends Money {
    public Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 100;
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
