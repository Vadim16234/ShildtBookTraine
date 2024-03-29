package com.kruchinin_Vadim.javacore.chapter10.multipleCatches;

// Продемонстрировать применение нескольких операторов catch
class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length; // 0, попробуй замени на любое другое число и обработается другая ошибка
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за пределами массива: " + e);
        }
        System.out.println("После блока операторов try/catch.");
    }
}
