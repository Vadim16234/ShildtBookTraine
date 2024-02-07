package com.kruchinin_Vadim.javacore.chapter15.referenceToInstsnceMethod2;

// Функциональный интерфейс с методом, принимающим два ссылочных аргумента и возвращающим логическое значение
interface MyFunc<T> {
    boolean func(T v1, T v2);
}
