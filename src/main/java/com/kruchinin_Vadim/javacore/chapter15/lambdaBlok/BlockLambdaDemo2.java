package com.kruchinin_Vadim.javacore.chapter15.lambdaBlok;

// В данном примере программы изменяется на обратный порядок следования символов в строке.
class BlockLambdaDemo2 {
    public static void main(String[] args) {
        // Это блочное выращение изменяет на обратный порядок следования символов в строке
        StringFunc2 reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Лямбда-выражение на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));
    }
}
