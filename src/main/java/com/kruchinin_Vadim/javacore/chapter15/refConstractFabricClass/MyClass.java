package com.kruchinin_Vadim.javacore.chapter15.refConstractFabricClass;

// Простой обощенный класс
class MyClass<T> {
    private T val;

    MyClass(T v) {
        val = v;
    }

    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
