package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("asdf", 10,"Asdf" );
        System.out.println(man);
        Man man2 = new Man("sdf", 1,"Asdfsd");
        System.out.println(man2);
        Woman woman = new Woman("assdf", 2,"Asdf");
        System.out.println(woman);
        Woman woman1 = new Woman("asdf", 10,"Asdf");
        System.out.println(woman1);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man( String name,int age, String address){
            this.age = age;
            this.address = address;
            this.name = name;
        }
        public String toString(){
            return name + " " + age + " " + address;
        }
    }
    public  static class Woman{
        String name;
        int age;
        String address;

        public Woman( String name,int age, String address){
            this.age = age;
            this.address = address;
            this.name = name;
        }
        public String toString(){
            return name + " " + age + " " + address;
        }
    }
    //напишите тут ваш код
}
