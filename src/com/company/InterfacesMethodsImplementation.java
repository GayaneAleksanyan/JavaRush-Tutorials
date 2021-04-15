package com.company;

public class InterfacesMethodsImplementation {
    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb {

        @Override
        public void run() {
        }

        @Override
        public void climb() {
        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
        @Override
        public void fly() {
        }

        @Override
        public void run() {
        }
    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }
}
