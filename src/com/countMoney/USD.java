package com.countMoney;

public class USD extends Money {

    public USD(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 500;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
