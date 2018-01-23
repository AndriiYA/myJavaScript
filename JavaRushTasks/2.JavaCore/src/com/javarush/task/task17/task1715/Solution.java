package com.javarush.task.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Аптека
Требования:

12. Методы класса DrugsController должны быть synchronized.
*/

public class Solution {
    public static DrugsController drugsController = new DrugsController();
    public static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread apteka = new Thread(new Apteka());
        Thread man = new Thread(new Person(), "Мужчина");
        Thread woman = new Thread(new Person(), "Женщина");

        apteka.start();
        man.start();
        woman.start();

        Thread.sleep(1000);
        isStopped = true;
    }


    public static class Apteka implements Runnable {

        public void run() {
            while(!isStopped){
                //10. Нить Person должна использовать drugsController для продажи случайного лекарства (getRandomDrug) в количестве (getRandomCount).
                drugsController.buy(getRandomDrug(), getRandomCount());
                waitAMoment();
                waitAMoment();
                waitAMoment(); //7. Нить Apteka должна ждать 300мс + "между закупками", используя метод waitAMoment().
            }

        }
    }

    public static class Person implements Runnable{

        public void run() {
              while(!isStopped){
                  drugsController.sell(getRandomDrug(),getRandomCount());
                  waitAMoment();
              }
            }
        }
    //11. Нить Person должна ждать 100мс + "между закупками", используя метод waitAMoment().

    public static int getRandomCount() {

        return (int) (Math.random() * 3) + 1;
    }

    public static Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (drugsController.allDrugs.size()));
        List<Drug> drugs = new ArrayList<>(drugsController.allDrugs.keySet());
        return drugs.get(index);
    }

    private static void waitAMoment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
