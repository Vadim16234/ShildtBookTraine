package com.kruchinin_Vadim.javacore.chapter6.methods;

// В этой программе применяется метод
public class Box1 {
    double width;
    double height;
    double depth;

    // вывести объем параллелепипеда
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}
