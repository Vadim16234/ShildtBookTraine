package com.kruchinin_Vadim.javacore.chapter18.comporator;

import java.util.TreeSet;

class CompDemo {
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        // второй вариант компортатора
        // MyComp mc = new MyComp();
        // TreeSet<String> ts = new TreeSet<String>(mc.reversed());

        // добавить данные в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // вывести элементы из древовидного множества
        for (String el : ts) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
