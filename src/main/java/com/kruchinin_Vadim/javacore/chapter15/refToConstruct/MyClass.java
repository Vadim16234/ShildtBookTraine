package com.kruchinin_Vadim.javacore.chapter15.refToConstruct;

class MyClass {
    private int val;

    // Этот конструктор прнимает один аргумент
    MyClass(int v) {
        val = v;
    }

    // А это конструктор по умолчанию
    MyClass() {
        val = 0;
    }

    int getVal() {
        return val;
    }
}
