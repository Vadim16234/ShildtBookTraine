package com.kruchinin_Vadim.javacore.chapter6.simpleClass;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox5 = new Box();
        Box myBox6 = new Box();
        double vol;

        // присвоить значения переменным экземпляра класса Box
        myBox5.width = 10;
        myBox5.height = 20;
        myBox5.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2
        myBox6.width = 3;
        myBox6.height = 6;
        myBox6.depth = 9;

        // получить обьем первого параллелепипеда
        vol = myBox5.volumeInBoxDemo4();
        System.out.println("Обьем равен " + vol);

        // получить объем второго параллелепипеда
        vol = myBox6.volumeInBoxDemo4();
        System.out.println("Объем равен " + vol);
    }
}
