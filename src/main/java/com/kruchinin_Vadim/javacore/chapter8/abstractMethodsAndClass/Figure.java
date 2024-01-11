package com.kruchinin_Vadim.javacore.chapter8.abstractMethodsAndClass;

// Применение абстрактных методов и классов
abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // теперь метод area() объявляется абстрактным
    abstract double area();
}
