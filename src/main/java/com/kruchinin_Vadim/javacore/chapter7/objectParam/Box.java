package com.kruchinin_Vadim.javacore.chapter7.objectParam;

// В этой версии класса Box один объект допускается
// инициализировать другим объектом
public class Box {
    double width;
    double height;
    double depth;

    // Обратите внимание на конструктор.
    // В качестве параметра в нем используется объект типа Box
    Box(Box ob) { // передаем объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, используемый, если ни один из размеров не указан
    Box() {
        width = -1; // использовать значение -1 для обозначения
        height = -1; // неинициализированного
        depth = -1; // параллелепипеда
    }

    // Конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
