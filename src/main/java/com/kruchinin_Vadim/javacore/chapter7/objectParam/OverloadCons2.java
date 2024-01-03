package com.kruchinin_Vadim.javacore.chapter7.objectParam;

public class OverloadCons2 {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        // тут применен конструктор, в который передавался объект класса Box
        Box myClone = new Box(myBox1); // создать копию myBox1

        double vol;

        // получить объем первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);

        // получить объем второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен " + vol);

        // получить объем третьего параллелепипеда
        vol = myCube.volume();
        System.out.println("Объем куба равен " + vol);

        // получить объем клона
        vol = myClone.volume();
        System.out.println("Объем клона равен " + vol);
    }
}
