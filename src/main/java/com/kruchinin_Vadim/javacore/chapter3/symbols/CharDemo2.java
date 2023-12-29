package com.kruchinin_Vadim.javacore.chapter3.symbols;

// Символьные переменные ведут себя как целочисленные значения
public class CharDemo2 {
    public static void main(String[] args) {
        char ch1;

        ch1 = 'X';
        System.out.println("ch1 содержит " + ch1);

        ch1++; // увеличить на единицу значение переменной ch1
        System.out.println("ch1 теперь водержит " + ch1);
    }
}
