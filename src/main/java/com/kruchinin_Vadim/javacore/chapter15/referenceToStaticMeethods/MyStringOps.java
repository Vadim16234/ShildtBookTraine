package com.kruchinin_Vadim.javacore.chapter15.referenceToStaticMeethods;

class MyStringOps {
    // Статический метод, изменяющий порядок следования символов в строке
    static String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
