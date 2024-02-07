package com.kruchinin_Vadim.javacore.chapter15.referenceToInstanceMethod;

class MethodRefDemo2 {
    // В этом методе функциональный интерфейс указывается в качестве типа первого его параметра. Следовательно,
    // ему может быть передан любой экземпляр этого интерфейса, включая и ссылку на метод
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        // создать объект типа MyStringOps
        MyStringOps strOps = new MyStringOps();

        // А теперь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
/*
    В данном примере программы обратите внимание на то, что метод strReverse() теперь объявляется в классе MyStringOps
как метод экземпляра. А в теле метода main() создается экземпляр strOps класса MyStringOps. Этот экземпляр служит
для создания ссылки на свой метод strReverse() при вызове метода stringOp(). В данном примере метод экземпляра
strReverse() вызывается для объекта strOps.
 */
