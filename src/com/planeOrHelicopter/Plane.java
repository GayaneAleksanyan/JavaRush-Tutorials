package com.planeOrHelicopter;

public class Plane implements com.planeOrHelicopter.CanFly {

    @Override
    public void fly() {

    }
    int passenger;
    public Plane(int passenger) {
        this.passenger = passenger;
    }
}
