package com.kruchinin_Vadim.javacore.chapter7.accessModifiers;

class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        // Эти операторы правильны, по этому члены а и b
        // данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и может вызвать ошибку
        // ob.c = 100; // ОШИБКА!

        // Доступ к члену "с" данного класса должен осуществляться с помощью методов ее класса
        ob.setC(100); // ВЕРНО. Присвоили значение с помощью Setter
        System.out.println("a, b, c: " + ob.b + " " + ob.b + " " + ob.getC()); // ob.getC Getter - полулчение значения
    }
}
