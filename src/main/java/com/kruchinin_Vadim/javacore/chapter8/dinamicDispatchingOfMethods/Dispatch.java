package com.kruchinin_Vadim.javacore.chapter8.dinamicDispatchingOfMethods;

class Dispatch {
    public static void main(String[] args) {
        A a = new A();  // объект класса А
        B b = new B();  // объект класса В
        C c = new C();  // объект класса С

        A r; // получить ссылку на объект типа А

        r = a;          // переменная r ссылается на объект типа A
        r.callme();     // вызывается вариант метода, определенный в классе А

        r = b;          // переменная r ссылается на объект типа B
        r.callme();     // вызывается вариант метода, определенный в классе B

        r = c;          // переменная r ссылается на объект типа C
        r.callme();     // вызывается вариант метода, определенный в классе C
    }
}
