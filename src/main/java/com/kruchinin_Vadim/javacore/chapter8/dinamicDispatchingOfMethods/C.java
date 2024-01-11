package com.kruchinin_Vadim.javacore.chapter8.dinamicDispatchingOfMethods;

class C extends B {
    // переопределить метод callme()
    void callme() {
        System.out.println("В метод callme() из класса С");
    }
}
