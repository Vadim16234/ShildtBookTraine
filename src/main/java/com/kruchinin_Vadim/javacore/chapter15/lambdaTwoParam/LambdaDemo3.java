package com.kruchinin_Vadim.javacore.chapter15.lambdaTwoParam;

// Продемонстрировать применение лямбда-выражения, принимающего два парамента
class LambdaDemo3 {
    public static void main(String[] args) {
        // В этом лямбда-выражении проверяется, является ли одно число множителем другого
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("Число 2 является множителем числа 10");
        }

        if (!isFactor.test(10, 3)) {
            System.out.println("Число 3 не является множителем числа 10");
        }
    }
}
/*
    В данном примере программы метод test() определяется в функциональном интерфейсе NumericTest2 следующим образом:
boolean test(int n, int d);

    При объявлении метода test() указываются два параметра. Следовательно, в лямбда-выражении, совместимом
с методом test(), следует также указать два параметра. Ниже показано, как это делается.
(n, d) -> (n % d) == О

    Оба параметра, n и d, указываются списком через запятую. Данный пример можно обобщить. Всякий раз,
когда в лямбда-выражении требуется больше одного параметра, их следует указать списком через запятую,
заключив в круглые скобки в левой части лямбда-оператора.
 */
