package com.kruchinin_Vadim.javacore.chapter4.arithmeticOperations;

// Продемонстрировать применение инкремента ++
public class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b; // префиксный инкремент, выполняется перед тем, как присваивается переменная
        d = a++; // постфиксный инкремент, выполняется только после того, как присвоили значение
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
