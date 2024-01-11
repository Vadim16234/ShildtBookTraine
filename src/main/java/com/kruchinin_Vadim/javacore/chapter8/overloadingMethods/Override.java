package com.kruchinin_Vadim.javacore.chapter8.overloadingMethods;

class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("Это k: "); // вызов метода show() из класса В
        subOb.show(); // вызов метода show() из класса А
    }
}
