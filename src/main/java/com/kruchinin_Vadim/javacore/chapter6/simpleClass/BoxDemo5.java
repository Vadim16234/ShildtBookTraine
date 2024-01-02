package com.kruchinin_Vadim.javacore.chapter6.simpleClass;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox7 = new Box();
        Box myBox8 = new Box();
        double vol;

        // инициализировать каждый экземпляр класса
        myBox7.setDim(10, 20, 15);
        myBox8.setDim(3, 6, 9);

        // получить обьем первого параллелепипеда
        vol = myBox7.volumeInBoxDemo4();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = myBox8.volumeInBoxDemo4();
        System.out.println("Объем равен " + vol);

    }
}
