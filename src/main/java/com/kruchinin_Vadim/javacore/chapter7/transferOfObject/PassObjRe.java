package com.kruchinin_Vadim.javacore.chapter7.transferOfObject;

class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b); // 15 20

        /*
            Объявлен объект ob класса Test. Инициализировали в качестве аргументов примитивние
            целочисленные значения. После того, как объект вызывает метод meth и передает,
            в качестве параметра метода, самого себя, происходит инициализированных
            раннее значений
         */

        ob.meth(ob); // изменения происходят внутри объекта

        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b); // 30 10

    }
}
