package com.company;

public class InterfaceCanFlyDouble {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {

        public Double speed();

    }

    interface CanFly extends CanMove {
        public Double speed(CanFly a);

    }
}
