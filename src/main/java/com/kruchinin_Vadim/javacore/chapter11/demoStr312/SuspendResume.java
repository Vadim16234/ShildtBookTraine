package com.kruchinin_Vadim.javacore.chapter11.demoStr312;

class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Приостановка потока Один");

            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Возобновление потока Один");

            ob2.mySuspend();
            System.out.println("Приостановка потока Два");
            Thread.sleep(1000);

            ob2.myResume();
            System.out.println("Возобновление потока Два");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        // ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидать завершения потоков");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен");
    }
}
