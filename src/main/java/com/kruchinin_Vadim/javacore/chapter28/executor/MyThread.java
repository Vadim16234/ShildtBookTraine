package com.kruchinin_Vadim.javacore.chapter28.executor;

import java.util.concurrent.CountDownLatch;

class MyThread implements Runnable {
    String name;
    CountDownLatch latch;

    MyThread(CountDownLatch c, String n) {
        latch = c;
        name = n;
        new Thread(this);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
