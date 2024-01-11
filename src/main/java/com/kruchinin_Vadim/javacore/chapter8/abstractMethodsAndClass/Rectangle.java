package com.kruchinin_Vadim.javacore.chapter8.abstractMethodsAndClass;

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // обязательное переопределение абстрактного метода area() для четырехугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
