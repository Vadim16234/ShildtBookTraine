package com.kruchinin_Vadim.javacore.chapter10.myException;

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Нормальное завершение");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
/*
    В данном примере определяется подкласс MyException, производный от класса Exception.
    Этот подкласс достаточно прост: он содержит только конструктор и переопределенный метод toString(),
    выводящий значение исключения. В классе ExceptionDemo определяется метод compute(),
    генерирующий объект исключения типа MyException. Это исключение генерируется, когда целочисленный параметр
    метода compute() принимает значение больше 10. В методе main() сначала устанамивается обработчик исключений
    типа MyException, затем вызывается метод compute() с правильным (меньше 10) и неправильным (больше 10)
    значением параметра, чтобы продемонстрировать оба пути выполнения кода.
 */
