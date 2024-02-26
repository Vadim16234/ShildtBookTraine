package com.kruchinin_Vadim.javacore.chapter28.phaser;

import java.util.concurrent.Phaser;

// Пример применения класса Phaser
class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков");

        new MyThread(phsr, "A");
        new MyThread(phsr, "B");
        new MyThread(phsr, "C");

        // ожидать завершения всеми потоками исполнения первой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // ожидать завершения всеми потоками исполнения второй фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // ожидать завершения всеми потоками исполнения третьей фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // снять основной поток исполнения с регистрации
        phsr.arriveAndAwaitAdvance();

        if (phsr.isTerminated()) {
            System.out.println("Синронизатор фаз завершен");
        }
    }
}
