package com.kruchinin_Vadim.javacore.chapter6.simpleClass;

public class BoxDemo7 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать обьекты типа Box
        Box myBox1 = new Box(10, 20,15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        // получить объем певого параллелепипеда
        vol = myBox1.volumeInBoxDemo4();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = myBox2.volumeInBoxDemo4();
        System.out.println("Объем равен " + vol);

    }
}
