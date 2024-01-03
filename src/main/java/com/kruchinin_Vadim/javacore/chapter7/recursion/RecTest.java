package com.kruchinin_Vadim.javacore.chapter7.recursion;

// еще один пример рекурсии
class RecTest {
    int values[];

    RecTest(int i) { // конструктор
        values = new int[i];
    }

    // вывести рекурсивно элементы массива
    void printArray(int i) { // рекурсивный метод
        if (i == 0) { // проверка условия
            return; // точка выхода из рекурсии
        } else {
            printArray(i - 1); // рекурсия
        }
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
