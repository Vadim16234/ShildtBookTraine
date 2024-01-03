package com.kruchinin_Vadim.javacore.chapter7.overloadConstruct;

public class OverloadCons {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);

        double vol;

        // получить объем первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);

        // получить объем второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен " + vol);

        // получить объем третьего параллелепипеда
        vol = myBox3.volume();
        System.out.println("Объем myBox3 равен " + vol);
    }
}
