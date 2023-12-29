package com.kruchinin_Vadim.javacore.chapter4.subbitLogicalOperations;

// Составные побитовые операторы с присваиванием для манипулирования переменными
public class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a |= 4; // подразрядная логическая операция ИЛИ с присваиванием
        b >>= 1; // сдвиг вправо с присваиванием
        c <<= 1; // сдвиг влево с присваиванием
        a ^= c; // подразрядная логическая операция исключающее ИЛИ с присваиванием

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
