package com.kruchinin_Vadim.javacore.chapter10.operatorThrows;

class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
