package com.kruchinin_Vadim.javacore.chapter8.abstractMethods;

// Простой пример абстракции
abstract class A {
    abstract void callMe();

    // Абстрактные классы все же могут содержать конкретные методы
    void callMeTo() {
        System.out.println("Это конкретный метод");
    }
}
