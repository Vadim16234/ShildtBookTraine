package com.kruchinin_Vadim.javacore.chapter15.emptyArrayException;

class EmptyArrayException extends Exception{
    EmptyArrayException() {
        super("Массив пуст");
    }
}
