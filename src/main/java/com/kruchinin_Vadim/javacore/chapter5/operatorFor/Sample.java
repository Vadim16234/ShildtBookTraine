package com.kruchinin_Vadim.javacore.chapter5.operatorFor;

// Использование нескольких переменных
public class Sample {
    public static void main(String[] args) {
        int a, b = 4;

        // Применение двух переменных в цикле
        for (a = 1; a < b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
    }
}
