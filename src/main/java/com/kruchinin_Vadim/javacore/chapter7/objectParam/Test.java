package com.kruchinin_Vadim.javacore.chapter7.objectParam;

// объекты допускается передавать методами в качестве параметров
public class Test {
    int a, b;

    Test(int i, int j) { // конструктор
        a = i;
        b = j;
    }

    // возвратить логическое значение true, если в качестве
    // параметра о указан вызывающий объект
    boolean equals(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}
