package com.kruchinin_Vadim.javacore.chapter20.directory;

import java.io.File;

// Использовать каталоги
class DirList {
    public static void main(String[] args) {
        String dirname = "/Users/Vadik/Documents/BookTraine/ShildtBookTraine";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " является каталогом");
                } else {
                    System.out.println(s[i] + " является файлом");
                }
            }
        } else {
            System.out.println(dirname + " не является каталогом");
        }
    }
}
