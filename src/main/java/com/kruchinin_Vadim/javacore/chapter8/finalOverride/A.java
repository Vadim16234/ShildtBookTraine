package com.kruchinin_Vadim.javacore.chapter8.finalOverride;

// Применение ключевого слова final
class A {
    // такой метод переопределить в другом классе нельзя
    final void meth() {
        System.out.println("Это завершенный методы");
    }
}
