package com.kruchinin_Vadim.javacore.chapter15.referenceToInstsnceMethod2;

// Класс для хранения максимальной температуры за день
class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    // возвратить true, усли вызывающий объект типа HighTemp имеет такую же температуру как и у ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // возвратить true, усли вызывающий объект типа HighTemp имеет ниже температуру чем у ht2
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
