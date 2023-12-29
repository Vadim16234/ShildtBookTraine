package com.kruchinin_Vadim.javacore.chapter3.primitiveTypes;

// использование переменной long
public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long second;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightSpeed = 186000;

        days = 1000; // указатель количесвта дней

        second = days * 24 * 60 * 60; // преобразовать в секунды

        distance = lightSpeed * second; // вычисление расстояния

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль");
    }
}
