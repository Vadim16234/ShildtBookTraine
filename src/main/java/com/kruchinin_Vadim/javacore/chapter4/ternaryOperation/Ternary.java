package com.kruchinin_Vadim.javacore.chapter4.ternaryOperation;

// Продемонстрировать применение тернарной операции ?
public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной i
        System.out.println("Абсолютное значение " + i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютное значение " + i + " равно " + k);
    }
}
