package com.kruchinin_Vadim.javacore.chapter8.finalOverride;

class B extends A {
    void meth() { // ОШИБКА! Этот метод не может быть переопределен.
        System.out.println("Недопустимо!!!");
    }
}
