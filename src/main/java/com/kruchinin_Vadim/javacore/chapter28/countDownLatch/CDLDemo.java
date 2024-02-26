package com.kruchinin_Vadim.javacore.chapter28.countDownLatch;

import java.util.concurrent.CountDownLatch;

// Продемонстрировать применение класса CountDownLatch
class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);

        System.out.println("Запуск потока исполнения");

        new MyThread(cd1);

        try {
            cd1.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Завершение потока исполнения");
    }
}
