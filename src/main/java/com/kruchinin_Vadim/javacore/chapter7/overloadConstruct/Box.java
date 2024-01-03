package com.kruchinin_Vadim.javacore.chapter7.overloadConstruct;

/*
    В данном примере конструкторы определяются в классе Box  для инициализации
    размеров параллелепипеда тремя разными способами
 */
public class Box {
    double width;
    double height;
    double depth;

    // конструктор, используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда ни один из размеров не указаны
    Box() {
        width = -1; // использовать значение -1 для обозначения
        height = -1; // неинициализированного
        depth = -1; // параллелепипеда
    }

    // конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
