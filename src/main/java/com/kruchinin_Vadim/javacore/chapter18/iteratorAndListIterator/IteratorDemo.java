package com.kruchinin_Vadim.javacore.chapter18.iteratorAndListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Продемонстрировать применение итераторов
class IteratorDemo {
    public static void main(String[] args) {
        // создать списочный массив
        ArrayList<String> al = new ArrayList<>();

        // добавить элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // использовать итераторы для вывода содержимого al
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element = " ");
        }
        System.out.println();

        // видоизменить перебираемые объекты
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("Измененное содержимое списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // а теперь отобразить список в обратном порядке
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
