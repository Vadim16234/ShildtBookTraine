package com.kruchinin_Vadim.javacore.chapter15.lambdaAsArguments;

// Передать лямбда-выражение в качестве аргумента методу
class LambdaAsArgumentsDemo {
    /*
        Первый параметр этого метода имеет тип функционального интерфейса. Следовательно, ему можно передать
        ссылку на любой экземпляр этого интерфейса, включая экземпляр, создаваемый в лямбда-выражении.
        А второй параметр обозначает обрабатываемую символьную строку
     */
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        // Ниже приведено простое лямбда - выражение , преобразующее
        // в верхний регистр букв все символы исходной строки, переда ваемой методу s StringOp()
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре: " + outStr);

        // А здесь передается блочное лямбда-выражение, удаляющее пробелы из исходной символьной строки
        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);

        System.out.println("Этo строка с удаленными пробелами : " + outStr);

        // Конечно, можно переда ть и экземпляр интерфейса StringFunc, созданный в предыдущем лямбда-выражении.
        // Например, послеследующего объявления ссылка reverse делается на экземпляр интерфейса StringFunc
        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        // А теперь ссылку reverse можно передать в качестве первого параметра методу stringOp()
        // since it refers to а StringFunc object.
        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));
    }
}
