package com.kruchinin_Vadim.javacore.chapter18.storeAndLoad;

import java.io.*;
import java.util.Properties;

// Простая база данных телефонных номеров, построенная на основе списков свойств
class PhoneBook {
    public static void main(String[] args) throws IOException{
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changes = false;

        // попытаемся открыть файл phonebook.dat
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            // игнорировать отсутствие файла
        }

        // Если телефонная книга уже существует, загрузить существующие телефонные номера.
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }

        // разрешить пользователю вводить новые имена и номера телефонов абонентов
        do {
            System.out.println("Введите имя ('выход' для завершения): ");
            name = br.readLine();
            if (name.equals("выход")) {
                continue;
            } else {
                System.out.println("Введите номер: ");
                number = br.readLine();
                ht.put(name, number);
                changes = true;
            }
        } while (!name.equals("выход"));
        // сохранить телефонную книгу, если она сохранилась
        if (changes) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }

        // искать номер по имени абонента
        do {
            System.out.println("Введите имя для поиска ('выход' для завершения): ");
            name = br.readLine();
            if (name.equals("выход")) {
                continue;
            }
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("выход"));
    }
}
