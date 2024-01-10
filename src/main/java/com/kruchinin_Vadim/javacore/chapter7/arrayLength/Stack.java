package com.kruchinin_Vadim.javacore.chapter7.arrayLength;

// Усовершенствованный класс Stack, в котором использован метод, определяющий длинну нассива
class Stack {
    private int stck[];
    private int tos;

    // Выделение памяти под стек и инициализировать его
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == stck.length - 1) { // применили метод length, определяющий дилнну массива
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
