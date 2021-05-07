package com.HensAndEggs;

public class BelarusianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + ("Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
