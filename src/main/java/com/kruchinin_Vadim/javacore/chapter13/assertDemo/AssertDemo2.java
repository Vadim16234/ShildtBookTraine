package com.kruchinin_Vadim.javacore.chapter13.assertDemo;

// Неудачное применение оператора assert
class AssertDemo2 {
    // получить генератор случайных чисел
    static int val = 3;

    // возвратить целочисленное значение
    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n = 0;

        for (int i = 0; i < 10; i++) {
            assert (n = getnum()) > 0; // Неудачная идея!

            System.out.println("n is " + n);
        }
    }
}
/*
    В этой версии программы вызов метода getnum() перенесен в оператор assert. И хотя такой прием оказывается вполне
работоспособным, когда активизирован режим проверки утверждений, отключение этого режима приведет к неправильной
работе программы, потому что вызов метода getnum() так и не произойдет! По существу, значение переменной n
должно быть теперь инициализировано, поскольку компилятор выявит, что это значение может и не быть
присвоено в операторе assert.
 */
