package com.kruchinin_Vadim.javacore.chapter28.semaphore.semaphore2;

class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
