package com.kruchinin_Vadim.javacore.chapter7.commandLine;

// Вывести все аргументы командной строки
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
/*
    Введите в командной строке:
    java CommandLine this is a test 100 -1
    но перед этим обязательная компиляция класса через javac
 */
