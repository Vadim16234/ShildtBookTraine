package com.kruchinin_Vadim.javacore.chapter18.saveObjClassInCollections;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        // добавить элементы в связный список
        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm Sr", "Champaign", "IL", "61820"));

        // вывести список почтовых адресов
        for (Address el : ml) {
            System.out.println(el + " ");
        }
    }
}
