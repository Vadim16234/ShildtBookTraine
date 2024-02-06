package com.kruchinin_Vadim.javacore.chapter13.assertDemo;

// Продемострировать применение оператора assert
class AssertDemo {
    static int val = 3;

    // возвратить целочисленное значение
    static int getnun() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getnun();

            assert n > 0; // не подствердится, если n == 0

            System.out.println("n равно " + n);
        }
    }
}
/*
    Чтобы разрешить проверку утверждений во время выполнения , следует указать
параметр -еа в командной строке. Например, для проверки утверждений в классе
AssertDemo нужно ввести следующую команду:
java -еа AssertDemo
Если класс не найдет, укажи полный путь от пакета src до нужного файла:
java -ea src/main/java/com/kruchinin_Vadim/javacore/chapter13/assertDemo/AssertDemo.java
 */
