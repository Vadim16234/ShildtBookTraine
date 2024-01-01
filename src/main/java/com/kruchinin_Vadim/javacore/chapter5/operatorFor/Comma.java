package com.kruchinin_Vadim.javacore.chapter5.operatorFor;

// Использование запятой в операторе цикла for
public class Comma {
    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
