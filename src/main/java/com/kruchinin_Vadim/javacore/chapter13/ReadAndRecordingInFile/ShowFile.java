package com.kruchinin_Vadim.javacore.chapter13.ReadAndRecordingInFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    Отображение содержимого текстового файла.
Чтобы воспользоваться этой программой, укажите имя файла, который требуется просмотреть.
Например , чтобы просмотреть файл TEST.TXT, введите в командной строке следующую команду:
java ShowFile TEST.TXT
 */
class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // сначала убедимся, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }

        // теперь файл открыт и готов к чтению. Далее из него читаются символы до тех пор,
        // пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }

        // закрыть файл
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }
    }
}
