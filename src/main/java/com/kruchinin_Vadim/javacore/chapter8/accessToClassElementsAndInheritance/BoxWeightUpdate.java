package com.kruchinin_Vadim.javacore.chapter8.accessToClassElementsAndInheritance;

// Теперь в классе BoxWeightUpdate ключевое слово super используется для
// инициализации собственных свойств объекта типа Box
class BoxWeightUpdate extends Box {
    double weight; // вес параллелепипеда

    // инициализировать поля width, height, depth с помощью метода super()
    BoxWeightUpdate(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}
/*
    В данном примере метод super() вызывается аргументами w, h, d из метода BoxWeight()
    Это приводит к вызову конструктора Box(), в котором поля width, height, depth инициализируются
    передаваемыми ему значениями соответствующих параметров. Теперь значения не инициализируются в
    самом классе BoxWeight. В нем осталось инициализировать его собственное поле weight.
    В итоге эти поля могут, если требуется, оставаться закрытыми в классе Box
 */
