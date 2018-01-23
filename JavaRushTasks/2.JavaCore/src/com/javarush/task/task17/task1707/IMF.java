package com.javarush.task.task17.task1707;

/*
Требования:

6. Метод getFund() должен всегда возвращать один и тот же объект.
 */
public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (IMF.class){
                if(imf == null)
                imf = new IMF();
        }
        return IMF.imf;
    }

    private IMF() {

    }
}
