package com.kruchinin_Vadim.javacore.chapter5.operationContinue;

// Применение continue
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) { // проверка числа на четность
                continue;
            }
            System.out.println("");
        }
    }
}
