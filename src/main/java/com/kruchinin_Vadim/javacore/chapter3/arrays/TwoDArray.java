package com.kruchinin_Vadim.javacore.chapter3.arrays;

// Продемонстрировать применение двухмерного массива
public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) { // цикл для заполнения пустого двумерного массива
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++) { //
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        // Резервирование памяти двухмерного массива по отдельности
        int twoDD[][] = new int[4][]; // резервирование памяти только для первого измерения массива при обьявлении
        twoDD[0] = new int[5]; // резервирование памяти для второго измерения осуществляется вручную
        twoDD[1] = new int[5];
        twoDD[2] = new int[5];
        twoDD[3] = new int[5];
    }
}
