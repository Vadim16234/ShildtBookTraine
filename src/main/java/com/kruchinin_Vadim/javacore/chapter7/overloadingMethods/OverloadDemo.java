package com.kruchinin_Vadim.javacore.chapter7.overloadingMethods;

// Продемонстрировать перегрузку методов
public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие одного целочисленного параметра
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие параметра типа double
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
