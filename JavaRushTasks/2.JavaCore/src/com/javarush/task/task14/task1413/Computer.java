package com.javarush.task.task14.task1413;

public class Computer {
    //5. Класс Computer должен содержать по одному приватному полю типа
    // Keyboard, Mouse, Monitor, а также существовать в отдельном файле.

    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;


    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
    public Mouse getMouse(){
        return mouse;
    }
    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {

        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

}
