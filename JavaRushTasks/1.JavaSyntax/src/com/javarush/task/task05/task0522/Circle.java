package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
1. У класса должно быть хотя бы три переменные.
2. У класса должен быть конструктор по умолчанию.
3. У класса должен быть хотя бы один конструктор.
4. У класса должно быть хотя бы два конструктора.
5. У класса должно быть хотя бы три конструктора.
6. У класса должно быть хотя бы четыре конструктора.
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double y){
        this.y = y;
    }
    public Circle(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Circle(double x, double y, double radius){
        this.y = y;
        this.x = x;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}