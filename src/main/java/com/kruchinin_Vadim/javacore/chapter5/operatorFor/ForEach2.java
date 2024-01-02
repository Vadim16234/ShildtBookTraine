package com.kruchinin_Vadim.javacore.chapter5.operatorFor;

// Применение оператора break в цикле for в стиле for each
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // искользовать for each для вывода и суммирования значений части массива
        for (int x : nums) {
            System.out.println("Значение равно " + x);
            sum += x;
            if (x == 5) {
                break; // прерывание цикла при получении нужного значения
            }
        }
        System.out.println("Сумма пяти первых элементов = " + sum);
    }
}
