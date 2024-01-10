package com.kruchinin_Vadim.javacore.chapter7.classString;

// Продемонстрировать применение массивов объектов типа String
class StringDemo3 {
    public static void main(String[] args) {
        String str[] = {"один", "два", "три"};

        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "]: " + str[i]);
        }
    }
}
