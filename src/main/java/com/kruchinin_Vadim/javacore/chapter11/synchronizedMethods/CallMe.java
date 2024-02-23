package com.kruchinin_Vadim.javacore.chapter11.synchronizedMethods;

class CallMe {
    synchronized void call(String msg) { // попробкуй убрать ключевое слово synchronized
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано.");
        }
        System.out.println("]");
    }
}
