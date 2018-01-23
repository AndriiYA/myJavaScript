package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfather1 = new Human("Ivan", true, 70);
        Human grandFather2 = new Human("Egor", true, 67);
        Human grandMother1 = new Human("Olia", false, 74);
        Human grandMother2 = new Human("Galia", false, 78);
        Human mother = new Human ("Elka",false,20, grandfather1, grandMother1);
        Human father = new Human ("Hren",true,30, grandFather2, grandMother2);

        Human child1 = new Human ("Redka",false,2, mother, father);
        Human child2 = new Human ("Morkovka",true,3, mother, father);
        Human child3 = new Human ("Repka",false,4, mother, father);

        System.out.println(grandfather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















