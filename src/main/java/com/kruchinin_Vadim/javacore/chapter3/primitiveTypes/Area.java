package com.kruchinin_Vadim.javacore.chapter3.primitiveTypes;

// Вычислить площадь круга
public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; // радиус окружности
        pi = 3.1416; // приблизительное значение числа Пи
        a = pi * r * r; // вычисление площади круга

        System.out.println("Площадь круга равна " + a);
    }
}
