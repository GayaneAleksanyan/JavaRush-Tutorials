package com.computerWorks;

public class Computer {

    private com.computerWorks.Keyboard keyboard;
    private com.computerWorks.Mouse mouse;
    private com.computerWorks.Monitor monitor;

    public Computer(com.computerWorks.Keyboard keyboard, com.computerWorks.Mouse mouse, com.computerWorks.Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public com.computerWorks.Keyboard getKeyboard() {
        return keyboard;
    }

    public com.computerWorks.Mouse getMouse() {
        return mouse;
    }

    public com.computerWorks.Monitor getMonitor() {
        return monitor;
    }
}
