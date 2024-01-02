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
}
