package com.kruchinin_Vadim.javacore.chapter15.genericFuncInterface;

// Применить обощенный функциональный интерфейс с разнотипными лямбда-выражениями
class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // использовать строковый вариант интерфейса SomeFunc
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Лямбда-выражение на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));

        // А тепреь использовать целочисленный вариант интерфейса SomeFunc
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Факториал числа 3 равен " + factorial.func(3));
        System.out.println("Факториал числа 5 равен " + factorial.func(5));
    }
}
/*
    Обобщенный функциональный интерфейс Some Func служит для предоставления ссылки на два разных типа
лямбда-выражений. В первом из них используется тип String, а во втором - тип Integer. Таким образом,
один и тот же интерфейс может быть использован для обращения к обоим лямбда-выражениям - reverse и factorial.
Отличается лишь аргумент типа, передаваемый обобщенному функциональному интерфейсу SomeFunc.
 */
