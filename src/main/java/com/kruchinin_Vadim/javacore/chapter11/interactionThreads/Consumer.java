package com.kruchinin_Vadim.javacore.chapter11.interactionThreads;

class Consumer implements Runnable{
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}
