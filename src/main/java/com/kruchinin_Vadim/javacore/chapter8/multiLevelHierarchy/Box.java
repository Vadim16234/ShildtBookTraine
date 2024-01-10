package com.kruchinin_Vadim.javacore.chapter8.multiLevelHierarchy;

class Box {

    double width;
    double height;
    double depth;

    // сконструировать клон объекта
    Box(Box ob) { // передать объекту конструктор
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствии размеров
    Box() {
        width = -1;  // значение -1 служит для обозначения
        height = -1;  // неинициализированного параллелепипеда
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
