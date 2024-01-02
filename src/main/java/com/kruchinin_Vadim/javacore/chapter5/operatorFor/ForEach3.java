package com.kruchinin_Vadim.javacore.chapter5.operatorFor;

// Применение for each для обращения к двухмерному массиву
public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // присвоение значения элементам массива nums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        // for each для вывода и суммирования значений
        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Значение равно: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
