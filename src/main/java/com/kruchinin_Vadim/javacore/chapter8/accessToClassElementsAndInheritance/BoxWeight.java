package com.kruchinin_Vadim.javacore.chapter8.accessToClassElementsAndInheritance;

// расширить класс Box, включив в него поле веса
/*
    Данный класс наследует все характеристики класса Box и добавляет к ним компонент weight
    Данному классу не нужно воссоздавать все характеристики класса Box, для этого достаточно
    расширить(наследоваться от) класс Box, исходя из конкретных целей
 */
class BoxWeight extends Box {
    double weight; // вес параллелепипеда

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

    // конструктор, применяемый по умолчанию
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
