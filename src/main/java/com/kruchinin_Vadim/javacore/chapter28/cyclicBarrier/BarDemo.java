package com.kruchinin_Vadim.javacore.chapter28.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

// Продемонстрировать применение класса CyclicBarrier
class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
    }
}
