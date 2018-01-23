package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width = 0;
    int height = 0;

    public void initialize(int top) {
        this.top = top;
    }

    public void initialize(int height, int top) {
        this.height = height;
        this.top = top;
    }

    public void initialize(int left, int height, int top) {
        this.left = left;
        this.height = height;
        this.top = top;
    }

    public void initialize(int width, int left, int height, int top) {
        this.width = width;
        this.left = left;
        this.height = height;
        this.top = top;
    }

    public static void main(String[] args) {

    }
}
