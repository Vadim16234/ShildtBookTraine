package com.kruchinin_Vadim.javacore.chapter7.arrayLength;

// В этой программе демонстрируется использование длинны массива
class Length {
    public static void main(String[] args) {
        int a1[] = new int[10];
        int a2[] = {3, 5, 7, 1, 8, 99, 44, -10};
        int a3[] = {4, 3, 2, 1};

        System.out.println("длинна а1 равна " + a1.length);
        System.out.println("длинна а2 равна " + a2.length);
        System.out.println("длинна а3 равна " + a3.length);
    }
}
