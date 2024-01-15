package com.kruchinin_Vadim.javacore.chapter18.linkedHashSet;

import java.util.LinkedHashSet;

// реализовать LinkedHashSet
class LinkedHashSetDemo {
    public static void main(String[] args) {
        // создать хэш-множество
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        // добавить элементы в хэш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
// все отличие от HashSet в том, что тут сохраняется порядок добавления элементов
