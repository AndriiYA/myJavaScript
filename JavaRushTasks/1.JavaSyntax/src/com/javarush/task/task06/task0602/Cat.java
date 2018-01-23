package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat = null;
        Dog dog = new Dog();
        dog = null;
        System.gc();

    }

    //напишите тут ваш код
     public Cat(){

     }

    protected void finalize() throws Throwable {
        try{
            System.out.println("Cat was destroyed");
        }finally {
            super.finalize();
        }

    }
}

class Dog {
    //напишите тут ваш код
    public Dog(){

    }

    protected void finalize() throws Throwable {
        try{
            System.out.println("Dog was destroyed");
        } finally {
            super.finalize();
        }

    }
}
