package com.kruchinin_Vadim.javacore.chapter7.accessModifiers;

class Test {
    int a; // доступ, определенный по умолчанию. Только внутри пакета
    public int b; // открытый доступ. Доступен для всех
    private  int c; // закрытый доступ. Доступен только внутри класса

    // методы доступа к члену с данного класса
    public int getC() { // получить значение члена "с" данного класса
        return c;
    }

    public void setC(int c) { // установить значение члена "с" данного класса
        this.c = c;
    }
}
