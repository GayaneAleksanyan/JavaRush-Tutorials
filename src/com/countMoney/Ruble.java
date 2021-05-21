package com.countMoney;

public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 200;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
