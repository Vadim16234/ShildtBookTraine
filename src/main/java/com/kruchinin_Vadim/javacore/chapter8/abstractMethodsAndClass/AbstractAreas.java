package com.kruchinin_Vadim.javacore.chapter8.abstractMethodsAndClass;

class AbstractAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10); // теперь недоступно
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref; // верно. но объект не создался

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
