package com.kruchinin_Vadim.javacore.chapter18.arrayDeque;

import java.util.ArrayDeque;

// Продемонстрировать применение класса ArrayDeque
class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать двухстороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<>();

        // использовать класс ArrayDeque для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Извлечение стека: ");

        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }
        System.out.println();
    }
}
