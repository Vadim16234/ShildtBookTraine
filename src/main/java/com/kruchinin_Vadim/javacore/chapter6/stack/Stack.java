package com.kruchinin_Vadim.javacore.chapter6.stack;

// в этом классе определяется целочисленный стек, в котором
// можно хранить до 10 целочисленных значений
public class Stack {
    int stck[] = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1; // обозначает пустой стек
    }

    // разместить элемент в стеке
    void push(int item) { // push - размещает элементы в стеке
        if (tos == 9) {
            System.out.println("Стек заполнен");
        } else {
            stck[++tos] = item;
        }
    }

    // извлечь элемент из стека
    int pop() { // pop - извлекает элементы из стека
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
