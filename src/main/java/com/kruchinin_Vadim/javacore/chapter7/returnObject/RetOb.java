package com.kruchinin_Vadim.javacore.chapter7.returnObject;

class RetOb {
    public static void main(String[] args) {
        Test ob1 = new Test(2); // инициализирован объект
        Test ob2; // объявлен объект

        ob2 = ob1.incrByTen(); // вызвали метод через ob1 и присвоили результат ob2
        System.out.println("ob1.a: " + ob1.a); // 2 - без изменений
        System.out.println("ob2.a: " + ob2.a); // 12 - изменение после вызова метода

        ob2 = ob2.incrByTen(); // 22 - увеличели аргумент объекта
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);
    }
}
