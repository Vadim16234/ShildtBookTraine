package com.kruchinin_Vadim.javacore.chapter5.operatorFor;

// Переменная цикла for each доступна только для чтения
public class NoChange {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // этот оператор не оказывает никакого влияния
        }
        System.out.println();

        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
