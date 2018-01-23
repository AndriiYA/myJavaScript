package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String profession;
        private int age;
        private boolean sex;
        private int  weight;
        private int height;

        public Human(){
        this.name = "Vasia";
        this.profession = "developer";
        this.age = 35;
        this.sex = true;
        this.weight = 89;
        this.height = 198;
        }
        public Human(String name, String profession, int age, Boolean sex, int weight, int height){
            this.name = name;
            this.profession = profession;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }
        public Human(String profession, int age, Boolean sex, int weight, int height){
            this.profession = profession;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }
        public Human(int age, Boolean sex, int weight, int height){
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }
        public Human(Boolean sex, int weight, int height){
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }
        public Human(int weight, int height){
            this.weight = weight;
            this.height = height;
        }
        public Human(int height){
            this.height = height;
        }
        public Human(String name,  int age, Boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String profession,int weight, int height){
            this.profession = profession;
            this.weight = weight;
            this.height = height;
        }
        public Human(String name, String profession){
            this.name = name;
            this.profession = profession;

        }

    }
}
