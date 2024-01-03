package com.kruchinin_Vadim.javacore.chapter7.transferOfArgumeents;

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20; // передаваемые аргументы

        System.out.println("a и b до вызова: " + a + " " + b); // 15 20

        /*
            Объект ob класса Test вызывает метод meth, который принимает на вход
            два примитивных целочивленных элемента в качестве аргумента.
            Во время передачи элементов методу создаются копии примитивных значений,
            которые не оказывают никакого влияния за пределами вызываемого метода
         */
        ob.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b); // 15 20
    }
}
