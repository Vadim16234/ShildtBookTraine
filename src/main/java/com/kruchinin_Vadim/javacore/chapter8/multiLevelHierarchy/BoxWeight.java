package com.kruchinin_Vadim.javacore.chapter8.multiLevelHierarchy;

class BoxWeight extends Box{
    double weight;

    // сконструировать клон объекта
    BoxWeight(BoxWeight ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // конструктор по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }

    // конструктор, применяемый при создании куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
