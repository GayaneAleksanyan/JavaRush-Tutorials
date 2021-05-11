package com.ComputerWorks;

public class Computer {

    private com.ComputerWorks.Keyboard keyboard;
    private com.ComputerWorks.Mouse mouse;
    private com.ComputerWorks.Monitor monitor;

    public Computer(com.ComputerWorks.Keyboard keyboard, com.ComputerWorks.Mouse mouse, com.ComputerWorks.Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public com.ComputerWorks.Keyboard getKeyboard() {
        return keyboard;
    }

    public com.ComputerWorks.Mouse getMouse() {
        return mouse;
    }

    public com.ComputerWorks.Monitor getMonitor() {
        return monitor;
    }
}
