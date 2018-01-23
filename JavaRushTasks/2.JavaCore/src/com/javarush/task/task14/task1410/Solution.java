package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    //7. В классе Solution должен быть реализован метод getDeliciousDrink(), который возвращает объект типа Wine.
    //8. В классе Solution должен быть реализован метод getWine(), который возвращает объект типа Wine.
    //9. В классе Solution должен быть реализован метод getBubblyWine(), который возвращает объект типа BubblyWine.

    public static Drink getDeliciousDrink() {

        return new Wine();
    }

    public static Wine getWine() {

        return new Wine();
    }

    public static Wine getBubblyWine() {

        return new BubblyWine();
    }
}
