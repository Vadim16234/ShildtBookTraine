package com.kruchinin_Vadim.javacore.chapter8.theOrderOfCallingConstr;

// создать подкласс путем расширения класса А
class B extends A{
    B() {
        System.out.println("В конструкторе В.");
    }
}
