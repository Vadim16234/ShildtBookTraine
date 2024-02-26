package com.kruchinin_Vadim.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

// Пример применения класса Exchanger
class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}
