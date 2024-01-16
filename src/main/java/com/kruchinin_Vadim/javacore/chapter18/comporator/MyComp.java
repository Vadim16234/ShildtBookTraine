package com.kruchinin_Vadim.javacore.chapter18.comporator;

import java.util.Comparator;

// компоратор для сравнения символьных строк в обратном порядке
class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        // выполнить сравнение в обратном порядке
        return bStr.compareTo(aStr); // последовательность сравнения решает. bStr первый, сортирует в обратном порядке
    }
    // переопределять equals не приходится
}
