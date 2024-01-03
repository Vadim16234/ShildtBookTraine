package com.kruchinin_Vadim.javacore.chapter7.overloadingMethods;

public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test2();
        ob.test2(10, 20);

        ob.test2(i); // вызывается вариант метода test(double)
        ob.test2(123.2); // а звесь вызывается вариант метода test(double)
    }
}
