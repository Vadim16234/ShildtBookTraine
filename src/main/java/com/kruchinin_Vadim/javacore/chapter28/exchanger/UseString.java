package com.kruchinin_Vadim.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

// Поток типа Thread, использующий символьную строку
class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    UseString(Exchanger<String> c) {
        ex = c;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                // обменять пустой буфер на заполненный
                str = ex.exchange(new String());
                System.out.println("Получено: " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
