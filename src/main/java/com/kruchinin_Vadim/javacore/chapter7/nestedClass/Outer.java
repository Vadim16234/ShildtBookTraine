package com.kruchinin_Vadim.javacore.chapter7.nestedClass;

// Продемонстрировать применение внутреннего класса
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // внутренний класс
    class Inner {
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
}
/*
    Внутренний класс - это нестатический вложенный класс. Он имеет доступ ко всем переменным и методам
    своего внешнего класса и может непосредственно ссылаться на них таким же образом, как это делают
    все остальные нестатические члены внешнего класса
 */

