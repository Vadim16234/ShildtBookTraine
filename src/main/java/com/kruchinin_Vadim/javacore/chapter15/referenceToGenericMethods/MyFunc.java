package com.kruchinin_Vadim.javacore.chapter15.referenceToGenericMethods;

// Функциональный интерфейс для обработки массива значений и возврата целочисленного результата
interface MyFunc<T> {
    int func(T[] vals, T v);
}
