package com.kruchinin_Vadim.javacore.chapter18.iteratorAndListIterator;

import java.util.ArrayList;

// Применение цикла for в стиле for each для перебора элементов коллекции
class ForEachDemo {
    public static void main(String[] args) {
        // создать списочный массив для целых чисел
        ArrayList<Integer> vals = new ArrayList<>();

        // добавить числовые значения в списочный массив
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // организовать цикл для вывода значений
        for (int v : vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        // суммировать числовые значения в цикле for
        int sum = 0;
        for (int v : vals) {
            sum += v;
        }
        System.out.println("Сумма численных значений: " + sum);
    }
}
