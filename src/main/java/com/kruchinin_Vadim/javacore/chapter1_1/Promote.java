package com.kruchinin_Vadim.javacore.chapter1_1;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
/*
(f * b) - тип переменной b продвигается к типу float, результат вычисления относится к float
(i / c) - тип переменной c продвигается к типу int, результат вычисления int
(d * s) - тип переменной s продвигается к типу double, результат вычисления double
в результате получается float + int - double
float + int = float
float - double = double
 */
