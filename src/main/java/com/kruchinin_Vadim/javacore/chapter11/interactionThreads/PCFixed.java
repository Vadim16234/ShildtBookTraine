package com.kruchinin_Vadim.javacore.chapter11.interactionThreads;

class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Control-C");
    }
}
