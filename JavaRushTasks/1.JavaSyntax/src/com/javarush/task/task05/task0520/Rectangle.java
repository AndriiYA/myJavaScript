package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int left;
    int top;
    int width = 0;
    int height = 0;
    public Rectangle(){
        this.left = left;
    }
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
    }
    public Rectangle(int left, int top, int height, int width){
        this.top = top;
        this.height = height;
        this.left = left;
        this.width = width;
    }
    public Rectangle(int left, int top, int height){
        this.top = top;
        this.height = height;
        this.left = left;

    }

    public static void main(String[] args) {

    }
}
