package com.kruchinin_Vadim.javacore.chapter3.scope;

// Продемонстрировать срок действия переменной
public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {

            int y = -1; // переменная у инициализируется при каждом вхождении в блок кода,
            // потому что при каждой итерации переменная заново инициализируется

            System.out.println("y равно: " + y); // тут всегда выводится значение -1

            y = 100; // присваиваем переменной новое значение
            System.out.println("y теперь равно: " + y); // тут всегда будет 100
        }
    }
}
