package com.kruchinin_Vadim.javacore.chapter15.referenceToGenericMethods;

class GenericMethodRefDemo {
    // В качестве первого параметра этого метода указывается функциональный интерфейс МyFunc, а в качестве двух других
    // параметров - массив и значение , причем оба типа Т
    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два"};
        int count;

        count = myOp(MyArrayOps::<Integer> countMatching, vals, 4);
        System.out.println("Массив vals  содержит " + count + "числа 4");

        count = myOp(MyArrayOps::<String> countMatching, strs, "Two");
        System.out.println("Массив strs  содержит " + count + "числа два");
    }
}
/*
    В данном примере программы необобщенный класс MyArrayOps содержит обобщенный метод countMatching().
Этот метод возвращает количество элементов в массиве, совпадающих с указанным значением. Обратите внимание на порядок
указания аргумента обобщенного типа.
 */
