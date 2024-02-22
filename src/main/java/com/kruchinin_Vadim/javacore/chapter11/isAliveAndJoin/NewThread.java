package com.kruchinin_Vadim.javacore.chapter11.isAliveAndJoin;

// Применить метод join(), чтобы ожидать завершения потоков исполнения
class NewThread implements Runnable{
    String name; // имя потока исполнения
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток исполнения: " + t);
        t.start(); // запустить поток исполнения
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
