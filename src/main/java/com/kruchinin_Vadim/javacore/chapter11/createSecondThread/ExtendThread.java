package com.kruchinin_Vadim.javacore.chapter11.createSecondThread;

class ExtendThread {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток

//        try {
//            for (int i = 5; i > 0; i--) {
//                System.out.println("Главный поток: " + i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Гланый поток прерван.");
//        }
//        System.out.println("Главный поток завершен.");
    }
}
