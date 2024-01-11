package com.kruchinin_Vadim.javacore.chapter8.overrideMethods;

class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // вывести содержимое переменной k с помощью метода,
    // переопредеяющего метод show() из класса А
    void show() {
        System.out.println("k: " + k);
    }

//    void show() {
//        super.show(); // здесь вызывается метод show() из класса А
//        System.out.println("k: " + k);
//    }
}
