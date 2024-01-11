package com.kruchinin_Vadim.javacore.chapter8.overrideMethods;

class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2 ,3);
        subOb.show(); // здесь вызывается метод show() из класса B
    }
}
