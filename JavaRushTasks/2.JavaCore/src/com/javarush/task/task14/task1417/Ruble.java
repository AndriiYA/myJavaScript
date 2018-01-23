package com.javarush.task.task14.task1417;

public class Ruble extends Money {

    public Ruble(double r) {
        super(r);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
