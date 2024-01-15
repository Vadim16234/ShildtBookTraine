package com.kruchinin_Vadim.javacore.chapter18.hashSet;

import java.util.HashSet;

// продемонстрировать применение класса HashSet
class HashSetDemo {
    public static void main(String[] args) {
        // создать хэш-множество
        HashSet<String> hs = new HashSet<String>();

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
