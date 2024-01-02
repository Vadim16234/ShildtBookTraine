package com.kruchinin_Vadim.javacore.chapter6.methods;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box1 mybox11 = new Box1();
        Box1 mybox22 = new Box1();

        // присвоить значения переменным экземпляра класса Box
        mybox11.width = 10;
        mybox11.height = 20;
        mybox11.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2
        mybox22.width = 3;
        mybox22.height = 6;
        mybox22.depth = 9;

        // вывести объем первого параллелепипеда
        mybox11.volume();

        // вывести объем второго параллелепипеда
        mybox22.volume();
    }
}
