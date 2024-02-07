package com.kruchinin_Vadim.javacore.chapter15.referenceToStaticMeethods;

class MethodRefDemo {
    // В этом методе функциональный интерфейс указывается в качестве типа первого параметра. Ему может быть передан
    // любой экземпляр этого интерфейса, включая ссылку на метод
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        // Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
