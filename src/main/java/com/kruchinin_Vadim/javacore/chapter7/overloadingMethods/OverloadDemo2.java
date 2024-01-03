package com.kruchinin_Vadim.javacore.chapter7.overloadingMethods;

// Применить автоматическое преобразование типов к перегрузке
public class OverloadDemo2 {
    void test2() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test2(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие параметра типа double
    void test2(double a) {
        System.out.println(" Внутреннее преобразование при вызове test(double) a: " + a);
    }
}
