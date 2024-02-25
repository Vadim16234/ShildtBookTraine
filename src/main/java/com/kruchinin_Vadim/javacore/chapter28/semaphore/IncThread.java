package com.kruchinin_Vadim.javacore.chapter28.semaphore;

import java.util.concurrent.Semaphore;

// Поток испонения, увеличивающий значение счетчика на единицу
class IncThread implements Runnable{
    String name;
    Semaphore sem;

    IncThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            // сначала получить разрешение
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение");
            // а теперь получить доступ к общему ресурсу

            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);

                // разрешить, если возможно, переключение контекста
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // освободить разрешение
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}
