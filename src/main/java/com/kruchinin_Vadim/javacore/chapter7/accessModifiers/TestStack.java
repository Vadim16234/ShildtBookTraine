package com.kruchinin_Vadim.javacore.chapter7.accessModifiers;

class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        // извлечь эти числа из стека
        System.out.println("Стек в myStack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Стек в myStack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }

        // эти операторы недопустимы
//        myStack1.tos = -2;
//        myStack2.stck[3] = 100;
    }
}
