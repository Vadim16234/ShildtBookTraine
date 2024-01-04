package com.kruchinin_Vadim.javacore.chapter7.staticPer;

class StaticByName {
    public static void main(String[] args) {
        StaticDemo.callMe(); // вызов статического метода из другого класса
        System.out.println("b = " + StaticDemo.b); // вывод статической переменной через имя класса
    }
}
