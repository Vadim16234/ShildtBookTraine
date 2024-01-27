package com.kruchinin_Vadim.javacore.chapter10.multipleInrerception;

// Продемонстрировать многократный перехват
class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};

        try {
            int result = a / b; // сгенерировать исключение типа ArithmeticException

            vals[10] = 19; // сгенерировать исключение типа ArrayIndexOutOfBoundsException

            // В этом операторе catch перехватываюся оба исключения
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
        System.out.println("После многократного перехвата.");
    }
}
/*
    В данном примере программы исключение типа ArithmeticException генерируется при попытке деления на нуль.
    Если закомментировать операцию деления и удалить комментарий из следующей строки кода,
    будет сгенерировано исключение типа ArrayIndexOutOfBoundsException.
    Оба исключения перехватываются одним из тем же оператором catch.
 */
