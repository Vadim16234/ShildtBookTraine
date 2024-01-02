package com.kruchinin_Vadim.javacore.chapter6.simpleClass;

public class Box {
    double width; // поля экземпляра класса
    double height;
    double depth;

    // вывести объем параллелепипеда. Метод для класса BoxDemo3
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }

    // возвращает обьем параллелепипеда. Метод для класса BoxDemo4
    double volumeInBoxDemo4() {
        return width * height * depth;
    }

    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
