package com.kruchinin_Vadim.javacore.chapter15.refToConstruct;

// В функциональном интерфейсе МyFunc определяется метод , возвращающий ссылку на класс МyClass
interface MyFunc {
    MyClass func(int n);
}
