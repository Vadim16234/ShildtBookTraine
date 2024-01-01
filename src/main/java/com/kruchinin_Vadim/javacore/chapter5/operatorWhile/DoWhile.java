package com.kruchinin_Vadim.javacore.chapter5.operatorWhile;

// продемострировать применение оператора цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);
    }
}
