package com.kruchinin_Vadim.javacore.chapter7.recursion;

// Простой пример рекурсии
class Factorial {
    // это рекурсивный метод
    int fact(int n) { // метод, который вызывает сам себя
        int result;

        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result; // возвращается метод fact(n-1) и выполняется с новым значением
    }
}
