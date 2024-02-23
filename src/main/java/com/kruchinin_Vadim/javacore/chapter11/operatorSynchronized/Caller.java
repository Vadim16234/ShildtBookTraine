package com.kruchinin_Vadim.javacore.chapter11.operatorSynchronized;

class Caller implements Runnable {
    String msg;
    Thread t;
    Callme target;

    Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    // синхпонизированный вызов метода call
    public void run() {
        synchronized (target) { // синхронизированный блок
            target.call(msg);
        }
    }
}
