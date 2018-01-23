package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;
    public Cat(){
        this.name = "";
        this.age = 0;
        this.weight = 0;
        this.strength = 0;
    }

    public boolean fight(Cat anotherCat) {

        //напишите тут ваш код

        if(this.strength > anotherCat.strength)
        {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "Vasia";
        cat1.age = 12;
        cat1.weight = 20;
        cat1.strength = 30;

        Cat cat2 = new Cat();
        cat2.name = "Boris";
        cat2.age = 10;
        cat2.weight = 21;
        cat2.strength = 29;





    }
}
