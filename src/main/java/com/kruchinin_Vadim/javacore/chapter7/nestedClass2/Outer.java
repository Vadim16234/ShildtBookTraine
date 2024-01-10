package com.kruchinin_Vadim.javacore.chapter7.nestedClass2;

// Определить внутренний класс в цикле for
class Outer {
    int outer_x = 100;
    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("вывод outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
