package com.kruchinin_Vadim.javacore.chapter1_1;

// Продемонстрировать применение одномерного массива
public class Array {
    public static void main(String[] args) {
        int monthDay[] = new int[12];
        monthDay[0] = 31;
        monthDay[1] = 28;
        monthDay[2] = 31;
        monthDay[3] = 30;
        monthDay[4] = 31;
        monthDay[5] = 30;
        monthDay[6] = 31;
        monthDay[7] = 31;
        monthDay[8] = 30;
        monthDay[9] = 31;
        monthDay[10] = 30;
        monthDay[11] = 31;
        System.out.println("В апреле " + monthDay[3] + " дней");
    }
}
