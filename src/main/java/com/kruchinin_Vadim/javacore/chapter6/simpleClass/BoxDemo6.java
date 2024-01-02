package com.kruchinin_Vadim.javacore.chapter6.simpleClass;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox11 = new Box();
        Box myBox22 = new Box();
        double vol;

        // получить объем первого параллелепипеда
        vol = myBox11.volumeInBoxDemo4();
        System.out.println("Обьем равен " + vol);

        // получить объем второго параллелепипеда
        vol = myBox22.volumeInBoxDemo4();
        System.out.println("Обьем равен " + vol);

    }
}
