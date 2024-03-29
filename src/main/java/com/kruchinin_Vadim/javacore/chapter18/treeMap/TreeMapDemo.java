package com.kruchinin_Vadim.javacore.chapter18.treeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapDemo {
    public static void main(String[] args) {
        // создать TreeMap
        TreeMap<String, Double> tm = new TreeMap<>();

        // добавить данные в TreeMap
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод Холл", 99.22);
        tm.put("Ральф Смит", -19.08);

        // получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}
