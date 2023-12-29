package com.kruchinin_Vadim.javacore.chapter2.operatorIf;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x меньше y");
        }

        x *= 2;
        if (x == y) {
            System.out.println("x теперь равно y");
        }

        x *= 2;
        if (x > y) {
            System.out.println("x теперь больше y");
        }

        if (x == y) {
            System.out.println("Условие не выполняется, это сообщение не отобразится");
        }
    }
}
