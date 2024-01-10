package com.kruchinin_Vadim.javacore.chapter8.accessToClassElementsAndInheritance;

// расширить класс Box, включив в него поле веса
/*
    Данный класс наследует все характеристики класса Box и добавляет к ним компонент weight
    Данному классу не нужно воссоздавать все характеристики класса Box, для этого достаточно
    расширить(наследоваться от) класс Box, исходя из конкретных целей
 */
class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    // конструктор
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
