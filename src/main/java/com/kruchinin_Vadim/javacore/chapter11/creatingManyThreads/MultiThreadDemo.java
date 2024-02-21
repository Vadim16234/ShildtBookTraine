package com.kruchinin_Vadim.javacore.chapter11.creatingManyThreads;

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Один"); // запустить потоки на исполнение
        new NewThread("Два");
        new NewThread("Три");

        try {
            // ожидать завершения других потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Глпавный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
// Вызов метода sleep(10000) в main() вынуждает главный поток перейти в состояние ожидания на 10 секунд и
// гарантирует его завершение последним
