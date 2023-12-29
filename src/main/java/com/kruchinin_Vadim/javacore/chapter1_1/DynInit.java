package com.kruchinin_Vadim.javacore.chapter1_1;

// Динамическая инициализация
public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной с (присвоение значений имени переменной)
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
