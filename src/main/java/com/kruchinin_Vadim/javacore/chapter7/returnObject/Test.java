package com.kruchinin_Vadim.javacore.chapter7.returnObject;

// возврат объекта
class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
