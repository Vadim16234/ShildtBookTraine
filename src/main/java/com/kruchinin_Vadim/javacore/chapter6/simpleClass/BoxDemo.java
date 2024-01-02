package com.kruchinin_Vadim.javacore.chapter6.simpleClass;

// В этом класса объявляется обьект типа Box
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(); // создать объект myBox класса Box

        double vol;
        // присвоить значения переменным экземпляра класса Box
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // рассчитать обьем параллелепипеда
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Обьем равен " + vol);
    }
}
