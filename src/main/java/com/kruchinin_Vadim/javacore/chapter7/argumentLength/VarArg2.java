package com.kruchinin_Vadim.javacore.chapter7.argumentLength;

// Использовать аргументы переменной длинны со стандартными аргументами
class VarArg2 {
    // в данном примере msg - обычный параметр,
    // а v - параметр переменной длинны
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Содержимое: ");
        for(int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один параметр переменной длинны: ", 10);
        vaTest("Три параметра переменной длинны: ", 1, 2, 3);
        vaTest("Без параметров переменной длинны: ");
    }
}
