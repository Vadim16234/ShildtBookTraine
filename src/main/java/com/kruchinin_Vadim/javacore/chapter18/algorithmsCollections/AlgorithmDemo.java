package com.kruchinin_Vadim.javacore.chapter18.algorithmsCollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// Продемострировать применение различных алгоритмов коллекций
class AlgorithmDemo {
    public static void main(String[] args) {
        // создать неинициализированный связный список
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // создать компаратор с обратным упорядочиванием
        Comparator<Integer> r = Collections.reverseOrder();

        // отсортировать список с помощью этого компоратора
        Collections.sort(ll, r);
        System.out.print("Список отсортирован в обратном порядке: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        // перетасовать список
        Collections.shuffle(ll);
        System.out.print("Список перетасован: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Минимум: " + Collections.min(ll));
        System.out.println("Максимум: " + Collections.max(ll));
    }
}
