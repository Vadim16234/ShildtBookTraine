package com.kruchinin_Vadim.javacore.chapter10.unprocessedExceptions;

// пример намеренно введенного оператора, вызывающий ошибку деления на нуль
class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
}
