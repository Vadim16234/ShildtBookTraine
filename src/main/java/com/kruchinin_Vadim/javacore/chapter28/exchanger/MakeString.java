package com.kruchinin_Vadim.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

// Поток типа Thread, формирующий символьную строку
class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;
    MakeString(Exchanger<String> c) {
        ex = c;
        str = new String();
        new Thread(this).start();
    }

    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            // заполнить буфер
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }
            try {
                // обменять заполненный буфер на пустой
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
