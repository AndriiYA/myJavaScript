package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 9;
    }
        public String getDescription() {
            return super.getDescription() + " Моя страна - "+ Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";

    }
}