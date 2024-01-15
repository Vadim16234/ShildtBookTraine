package com.kruchinin_Vadim.javacore.chapter18.linkedList;

import java.util.LinkedList;

// продемонстрировать применение класса LinkedList
class LinkedListDemo {
    public static void main(String[] args) {
        // создать связный список
        LinkedList<String> ll = new LinkedList<String>();

        // добавить элементы в связный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("Исходное содержимое связного списка LinkedList: " + ll);

        // удалить элементы из связного списка
        ll.remove("F");
        ll.remove(2);

        System.out.println("Содержимое ll после удаления элементов: " + ll);

        // удалить первый и последний элементы из связного списка
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое ll после удаления первого и последнего элементов: " + ll);

        // получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Содержимое ll после изменения: " + ll);
    }
}
