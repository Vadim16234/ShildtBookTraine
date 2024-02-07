package com.kruchinin_Vadim.javacore.chapter15.emptyArrayException;

class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        // Вычисление среднего значения типа double в массиве
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if (n.length == 0) {
                throw new EmptyArrayException();
            }

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };
        System.out.println("Среднее равно " + average.func(values));

        // Эта строка кода приводит к генерации исключения
        System.out.println("Среднее равно " + average.func(new double[0]));
    }
}
/*
    В результате первого вызюва мегода average.func() воавращается среднее значение 2,5. А при втором вызове
этому методу передается массив нулевой длины, что приводит к генерированию исключения типа EmptyArrayException.
Напомним, что наличие выражения throw в объявлении метода func() обязательно. Без этого программа не будет
скомнилирована, поскольку лямбда-выражение перестанет быть совместимым с методом func().
 */
