package com.kruchinin_Vadim.javacore.chapter13.instanceofDemo;

class Instanceof {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A) {
            System.out.println("а является экземпляром А");
        }
        if (b instanceof B) {
            System.out.println("b является экземпляром B");
        }
        if (c instanceof C) {
            System.out.println("c является экземпляром C");
        }
        if (c instanceof A) {
            System.out.println("c можно привести к типу А");
        }
        if (a instanceof C) {
            System.out.println("а является экземпляром C");
        }

        System.out.println();

        // сравнить с порожденными типами
        A ob;

        ob = d; // ссылка на объект d
        System.out.println("ob теперь ссылается на d");
        if (ob instanceof D) {
            System.out.println("ob является экземпляром D");
        }

        System.out.println();

        ob = c; // ссылка на объект c
        System.out.println("ob теперь ссылается на c");
        if (ob instanceof D) {
            System.out.println("ob можно привести к типу D");
        } else {
            System.out.println("ob нельзя привести к типу D");
        }

        if (ob instanceof A) {
            System.out.println("ob можно привести к типу A");
        }

        System.out.println();

        // все объекты могут быть приведены к типу Object
        if (a instanceof Object) {
            System.out.println("a может быть приведен к типу Object");
        }
        if (b instanceof Object) {
            System.out.println("b может быть приведен к типу Object");
        }
        if (c instanceof Object) {
            System.out.println("c может быть приведен к типу Object");
        }
        if (d instanceof Object) {
            System.out.println("d может быть приведен к типу Object");
        }
    }
}
