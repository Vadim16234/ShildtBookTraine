package com.kruchinin_Vadim.javacore.chapter7.argumentLength;

// Продемонстрировать применение аргументов с переменной длинны
class VarArg {
    // теперь метод vaTest() объявляется с аргументами переменной длинны
    static void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for(int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на возможные способы вызова
        // метода vaTest() с аргументами переменной длинны
        vaTest(10); // 1 аргумент
        vaTest(1, 2, 3); // 3 аргумента
        vaTest(); // без аргументов
    }

}
