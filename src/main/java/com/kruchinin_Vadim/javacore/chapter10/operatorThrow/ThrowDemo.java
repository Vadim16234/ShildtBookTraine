package com.kruchinin_Vadim.javacore.chapter10.operatorThrow;

// Продемонстрировать применение оператора throw
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc().");
            throw e; // повторно сгенерировать исключение
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
/*
    Эта программа получает две возможности для обработки одной и той же ошибки.Сначала в методе main()
    устанавливается контекст исключения, затемвызывается метод demoproc(),
    где задается другой контекст обработки исключения и сразу же генерируется новый экземпляр исключения
    типа NullPointerException, который перехватывается в следующей строке кода.
    Затем исключение генерируется повторно.
    Ниже приведен результат, выводимый этой программой:
    Исключение перехвачено в теле метода demoproc().
    Повторный перехват: java.lang.NullPointerException: демонстрация

    В этом примере программы демонстрируется также, каким образом создаются объекты стандартных исключений в Java.
    Обратите внимание на следующую строку кода:
    throw new NullPointerException ("дeмoнcтpaция");

    Здесь оператор new служит для создания экземпляра исключения типа NullPointerException.
    Многие классы встроенных в Java исключений, возникающих во время выполнения, имеют по меньшей мере
    две формы конструктора: без параметров и со строковым параметром. Если применяется вторая форма конструктора,
    его аргумент обозначает символьную строку, описывающую исключение. Эта символьная строка выводится,
    когда объект исключения передается в качестве аргумента методу рrint() или println().
    Она может быть также получена в результате вызова метода getMessage(), определенного в классе Throwable.
 */
