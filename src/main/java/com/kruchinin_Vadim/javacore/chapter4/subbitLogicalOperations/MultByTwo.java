package com.kruchinin_Vadim.javacore.chapter4.subbitLogicalOperations;

// Применение сдвига влево в качестве быстрого способа умножения на 2
public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
/*
    Каждый сдвиг влево на одну позицию, по существу, удваивает исходное значение
    При сдвиге единичного двоичного разряда на старшую (31ю или 63ю) позицию значение становится отрицательным
 */