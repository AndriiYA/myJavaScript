package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        LatteMaker latteMaker = new LatteMaker();
        teaMaker.getRightCup();
        teaMaker.putIngredient();
        teaMaker.pour();
        latteMaker.getRightCup();
        latteMaker.putIngredient();
        latteMaker.pour();
    }
}
