package com.kruchinin_Vadim.javacore.chapter8.inheritance;

// создать подкласс путем расширения класса А
class B extends A { // этот подкласс включает в себя все элементы суперкласса А
    int k;
    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}
