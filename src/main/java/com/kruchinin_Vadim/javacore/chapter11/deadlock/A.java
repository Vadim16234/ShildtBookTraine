package com.kruchinin_Vadim.javacore.chapter11.deadlock;

// пример взаимной блокировки
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод А.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс А прерван");
        }
        System.out.println(name + " пытается вызвать метод B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}
