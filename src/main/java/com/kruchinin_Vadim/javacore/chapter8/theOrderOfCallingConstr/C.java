package com.kruchinin_Vadim.javacore.chapter8.theOrderOfCallingConstr;

// создать еще один подкласс путем расширения класса В
public class C extends B{
    C() {
        System.out.println("В конструкторе С.");
    }
}
