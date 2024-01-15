package com.kruchinin_Vadim.javacore.chapter18.treeSet;

import java.util.TreeSet;

// продемонстрировать применение класса TreeSet
class TreeSetDemo {
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<>();

        // добавить элементы в древовидное множество типа TreeSet
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);

        // вывод элементов в промежутке от и до
        System.out.println(ts.subSet("C", "F"));
    }
}
