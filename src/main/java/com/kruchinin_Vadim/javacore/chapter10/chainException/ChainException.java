package com.kruchinin_Vadim.javacore.chapter10.chainException;

// Продемонстрировать цепочки исключений
class ChainException {
    static  void demoproc() {
        // создать исключение
        NullPointerException e = new NullPointerException("верхний уровень");

        // добавить причину исключения
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            // вывести исключение, послужившее причиной для исключения верхнего уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
/*
    В данном примере исключение верхнего уровня относится к типу NullPointerException.
    Это исключение дополнено исключением типа АrithmеtiсЕхсерtiоn, по причине которого оно возникает.
    Когда исключение верхнего уровня генерируется в методе demoproc(), оно перехватывается в методе main(),
    где оно выводится, а вслед за ним - исключение, которое послужило причиной для его появления и
    которое получается в результате вызова метода getCause().
 */
