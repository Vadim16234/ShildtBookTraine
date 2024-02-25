package com.kruchinin_Vadim.javacore.chapter28.semaphore;

import java.util.concurrent.Semaphore;

// Простой пример использования семафора
class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}
