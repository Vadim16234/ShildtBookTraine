package com.kruchinin_Vadim.javacore.chapter18.comporator;

import java.util.Comparator;

// использовать компоратор для сортировки счетов по фамилии вкладчиков
// сравнить последние слова в обеих символьных строках
class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) { // Фамилии совпадают, проверить имя и фамилию полностью
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
    // переопределять метод equals не требуется
}
