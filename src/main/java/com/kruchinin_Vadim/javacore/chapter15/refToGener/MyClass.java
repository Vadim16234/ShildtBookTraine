package com.kruchinin_Vadim.javacore.chapter15.refToGener;

class MyClass<T> {
    private T val;

    // Этот конструктор принимает один аргумент
    MyClass(T v) {
        val = v;
    }

    // Этот конструктор по умолчанию
    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
