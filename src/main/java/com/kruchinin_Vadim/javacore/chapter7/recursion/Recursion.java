package com.kruchinin_Vadim.javacore.chapter7.recursion;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial(); // создали объект

        System.out.println("Факториал 3 равен: " + f.fact(3)); // вызов метода объектом
        System.out.println("Факториал 4 равен: " + f.fact(4));
        System.out.println("Факториал 5 равен: " + f.fact(5));
    }
}
