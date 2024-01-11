package com.kruchinin_Vadim.javacore.chapter8.overloadingMethods;

// Методы с отличающимися сигнатурами считаются перегружаемыми, а не переопределяемыми
class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
