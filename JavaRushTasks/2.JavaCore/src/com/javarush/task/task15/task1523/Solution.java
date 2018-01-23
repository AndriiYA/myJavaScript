package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
1. В классе SubSolution должно содержаться 3 различных конструктора.
2. В классе Solution должно содержаться 4 различных конструктора.
3. В классе Solution должны быть объявлены конструкторы со всеми возможными модификаторами доступа.
4. В классе SubSolution должны быть объявлены конструкторы со всеми возможными модификаторами доступа кроме private.
5. Класс Solution должен быть родителем класса SubSolution.
*/

public class Solution {
    public Solution(){
    }
    protected Solution(int i){
    }
    private Solution(double d){
    }
    Solution(Object o){
    }

    public static void main(String[] args) {

    }
}

