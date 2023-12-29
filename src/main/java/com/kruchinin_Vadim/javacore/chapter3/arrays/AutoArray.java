package com.kruchinin_Vadim.javacore.chapter3.arrays;

// Усовершенствованная версия одномерного массива
public class AutoArray {
    public static void main(String[] args) {
        // Объявили массив целых чисел, инициализировали его без оператора new и указания размера
        int monthDay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("В апреле " + monthDay[3] + " дней");
    }
}
