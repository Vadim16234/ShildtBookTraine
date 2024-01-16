package com.kruchinin_Vadim.javacore.chapter18.arrays;

import java.util.Arrays;

// продемонстрировать применение некоторых методов из класса Arrays
class ArraysDemo {

    static void display(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // выделить и инициализировать массив
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = -3 * i;
        }

        // вывести, отсортировать и снова вывести содержимое массива
        System.out.print("Исходный массив: ");
        display(array);

        // сортировка массива
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);

        // заполнить массив и вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Массив после вызова метода fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.print("Отсортированный повторно массив: ");
        display(array);

        // выполнить двоичный поиск значений -9
        System.out.print("Значение -9 находится на позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }
}
