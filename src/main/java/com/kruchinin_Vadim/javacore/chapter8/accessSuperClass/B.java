package com.kruchinin_Vadim.javacore.chapter8.accessSuperClass;

// создать подкласс путем расширения класса А
class B extends A{
    int i; // этот элемент i скрывает элемент i из класса А

    B(int a, int b) {
        super.i = a; // элемент i из класса А
        i = b;       // элемент i из класса В
    }

    void show() {
        System.out.println("Элемент i в суперкласса: " + super.i);
        System.out.println("Элемент i в подклассе: " + i);
    }
}
