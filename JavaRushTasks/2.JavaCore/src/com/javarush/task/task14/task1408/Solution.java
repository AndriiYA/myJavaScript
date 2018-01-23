package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.MOLDOVA);
        //System.out.println(hen.getCountOfEggsPerMonth());
    hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country.equals(Country.RUSSIA))
                hen =  new RussianHen();

            if (country.equals(Country.UKRAINE))
                hen =  new UkrainianHen();

            if (country.equals(Country.MOLDOVA))
                hen =  new MoldovanHen();

            if (country.equals(Country.BELARUS))
                hen =  new BelarusianHen();

            return hen;
        }
    }
}
