package com.kruchinin_Vadim.javacore.chapter18.comporator;

import java.util.Comparator;

/*
    Использовать метод thenComparing() для сортировки счетов вкладчиков
    сначала по фамилии, а затем по имени
 */
class CompLastName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        // найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
