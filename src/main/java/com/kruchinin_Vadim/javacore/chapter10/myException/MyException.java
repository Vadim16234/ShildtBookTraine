package com.kruchinin_Vadim.javacore.chapter10.myException;

// В этой программе создается специальный тип исключения
class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
