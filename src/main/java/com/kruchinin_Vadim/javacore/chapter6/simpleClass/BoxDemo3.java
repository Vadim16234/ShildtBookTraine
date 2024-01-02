package com.kruchinin_Vadim.javacore.chapter6.simpleClass;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox3 = new Box();
        Box myBox4 = new Box();

        // присвоить значения переменным экземпляра класса Box
        myBox3.width = 10;
        myBox3.height = 20;
        myBox3.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2
        myBox4.width = 3;
        myBox4.height = 6;
        myBox4.depth = 9;

        // вывести объем первого параллелепипеда
        myBox3.volume();

        // вывести объем второго параллелепипеда
        myBox4.volume();
    }
}
