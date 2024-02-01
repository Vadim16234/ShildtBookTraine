package com.kruchinin_Vadim.javacore.chapter13.readingSymbolsLine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Чтение символьных строк с консоли средства класса BufferedReader
/*
    В приведенном ниже примере программы демонстрируется применение класса BufferedReader и метода readLine().
Эта программа читает и выводит текстовые строки текста до тех пор, пока не будет введено слово "стоп".
 */
class BRReadLines {
    public static void main(String[] args) throws IOException {
        // создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("стоп"));
    }
}
