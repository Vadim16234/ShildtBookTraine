package com.kruchinin_Vadim.javacore.chapter11.createAndStartNewThread;

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен");
    }
}

/*
    Передача ссылки this на текущий объект в первом аргументе данного конструктора означает следующее: в новом потоке
исполнения для текущего объекта по ссылке this следует вызвать метод run(). Далее в приведенном выше примере
программы вызывается метод start(), в результате чего поток исполнения запускается, начиная с метода run().
Это, в свою очередь, приводит к началу цикла for в дочернем потоке исполнения. После вызова метода start()
конструктор NewThread() возвращает управление методу main(). Возобновляя свое исполнение, главный поток входит в
свой цикл for. Далее потоки выполняются параллельно, совместно используя ресурсы процессора в одноядерной системе,
вплоть до завершения своих циклов.
 */
