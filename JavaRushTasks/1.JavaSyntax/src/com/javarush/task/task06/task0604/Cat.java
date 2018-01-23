package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat (){
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        try{
            catCount--;
            System.out.println(catCount);
        }finally {
            super.finalize();
        }


    }

    //напишите тут ваш код

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            Cat cat = new Cat();
        }
        Cat cat2= new Cat();
        cat2 = null;
        System.gc();

    }
}