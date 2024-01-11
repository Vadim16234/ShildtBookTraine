package com.kruchinin_Vadim.javacore.chapter8.dinamicDispatchingOfMethods;

class B extends A {
    // переопределить метод callme
    void callme() {
        System.out.println("В метод callme() из класса В");
    }
}
