package com.kruchinin_Vadim.javacore.chapter5.operationsTransition;

// Выход из цикла while при помощи break
public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            if (i == 10) {
                break;
            }
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл завершен.");
    }
}
