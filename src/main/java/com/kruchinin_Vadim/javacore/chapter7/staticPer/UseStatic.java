package com.kruchinin_Vadim.javacore.chapter7.staticPer;

// Продемонстрировать статические переменные, методы и блоки
class UseStatic {
    static  int a = 3;
    static  int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Статический блок инициализирован.");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
