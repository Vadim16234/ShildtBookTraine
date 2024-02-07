package com.kruchinin_Vadim.javacore.chapter15.referenceToGenericMethods;

// В этом классе определяется метод countMatching(), возвращающий количество элементов в массиве , равных указанному
// значению. Метод countMatching() является обобщенным, тогда как класс МyArrayOps - необобщенным
class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}
