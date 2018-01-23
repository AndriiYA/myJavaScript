package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Требования:
1. Статический блок класса Solution должен создавать и добавлять 5 нитей в список threads.
2. Нити из списка threads не должны стартовать автоматически.
3. Нить 1 из списка threads должна бесконечно выполняться.
4. Нить 2 из списка threads должна выводить "InterruptedException" при возникновении исключения InterruptedException.
5. Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
6. Нить 4 из списка threads должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться.
7. Нить 5 из списка threads должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
 */
public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new ThreadInfinity("Thread Infinitely"));
        threads.add(new ThreadInterruptes("Thread Interrupted"));
        threads.add(new ThreadUra("Thread Ura"));
        threads.add(new ThreadMessage("Thread Message"));
        threads.add(new ThreadNumberInputs("Thread Number Inputs"));

    }

    public static void main(String[] args) {
        for(Thread list : threads){
            System.out.println(list);
        }
    }
    // Нить 1 из списка threads должна бесконечно выполняться.
    public static class ThreadInfinity extends Thread {

        public ThreadInfinity(String name) {
            super(name);
        }
        public void run(){
            while (true){
            }
        }
    }
    // Нить 2 из списка threads должна выводить "InterruptedException" при возникновении исключения InterruptedException.
    public static class ThreadInterruptes extends Thread{
        public ThreadInterruptes(String name) {
            super(name);
        }
        public void run(){
            try{
                Thread.sleep(100000000);
            }catch(InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
// Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
    public  static class ThreadUra extends Thread {
    public ThreadUra(String name) {
        super(name);
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Ура");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
   //Нить 4 из списка threads должна реализовать интерфейс Message,
    // при вызове метода showWarning нить должна останавливаться.
   public static class ThreadMessage extends Thread implements Message {

       private boolean die;

       public ThreadMessage(String name) {
           super(name);
           this.die = false;
       }

       @Override
       public void run() {
           while (die == false) {
           }
       }

       @Override
       public void showWarning() {
           die = true;
       }
   }

    public static class ThreadNumberInputs extends Thread {

        public ThreadNumberInputs(String name) {
            super(name);
        }

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            String s = null;
            while (true) {
                try {
                    s = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s.equals("N") == true)
                    break;

                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        }
    }
}