package com.kruchinin_Vadim.javacore.chapter9.accessProtection.p2;

// получить экземпляры различных классов из пакета р2
public class Demo {
    public static void main(String[] args) {
        Protection2 ob1 = new Protection2();
        OtherPackage ob2 = new OtherPackage();
    }
}
