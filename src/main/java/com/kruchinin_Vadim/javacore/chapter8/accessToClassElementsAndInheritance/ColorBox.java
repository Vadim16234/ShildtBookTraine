package com.kruchinin_Vadim.javacore.chapter8.accessToClassElementsAndInheritance;

// этот класс расширяет класс Box, включая в него свойство цвета
class ColorBox extends Box{
    int color; // цвет параллелепипеда

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
