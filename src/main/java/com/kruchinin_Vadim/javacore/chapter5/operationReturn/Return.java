package com.kruchinin_Vadim.javacore.chapter5.operationReturn;

// Применение return
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата.");

        if (t) {
            return; // возврат в вызывающий код
        }
        System.out.println("Этот оператор выполняться не будет.");
    }
}
