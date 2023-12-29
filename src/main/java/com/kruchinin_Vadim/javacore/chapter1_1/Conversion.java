package com.kruchinin_Vadim.javacore.chapter1_1;

// Продемонстрировать приведение типов
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование типа int в тип byte.");
        b = (byte) i;
        System.out.println("i и b " + i + " " + b); // i(257) % b(256) = 1; где b(256) - диапозон допустимых значений

        System.out.println("\nПреобразование типа double в тип int.");
        i = (int) d;
        System.out.println("d и i " + d + " " + i); // i=323; убрали все значения после запятой

        System.out.println("\nПреобразование типа double в тип byte");
        b = (byte) d;
        System.out.println("d и b " + d + " " + b); // d(323) % b(256) = 67
    }
}
/*
    При преобразовании типа int в byte, значение int слишком большое для типа byte, по этому применяется
модульное деление (%), в котором значение типа int делится на диапозон значений типа byte.

    При преобразовании типа double в тип значений int, у значения double отбрасываются все значения после запятой.

    При преобразовании типа double в тип byte, у значения double вначале отбрасывается его дробная часть,
полученное число делим по модулю на 256(диапозон значений byte).
    Если число входит в диапозон значений, тогда от числа переводимого типа вычетается значение диапозона и получается
значение byte.
 */
