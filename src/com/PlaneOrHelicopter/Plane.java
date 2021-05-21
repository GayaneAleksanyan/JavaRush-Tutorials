package com.PlaneOrHelicopter;

public class Plane implements com.PlaneOrHelicopter.CanFly {

    @Override
    public void fly() {

    }
    int passenger;
    public Plane(int passenger) {
        this.passenger = passenger;
    }
}
