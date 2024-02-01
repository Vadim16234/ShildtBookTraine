package com.kruchinin_Vadim.javacore.chapter13.readingSymbolsLine;

// Простойший текстовый редактор

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    В следующем примере программы демонстрируется простейший текстовый редактор.
С этой целью сначала создается массив объектов типа String, а затем читаются текстовые строки,
каждая из которых сохраняется в элементе массива. Чтение производится до 100 строк или до тех пор,
пока не будет введено слово "стоп". Для чтения данных с консоли применяется класс BufferedReader.
 */
class TinyEdit {
    public static void main(String[] args) throws IOException {
        // создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп")) {
                break;
            }
        }
        System.out.println("\nСодержимое вашего файла:");
        // вывести текстовые строки
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("стоп")) {
                break;
            } else {
                System.out.println(str[i]);
            }
        }
    }
}
