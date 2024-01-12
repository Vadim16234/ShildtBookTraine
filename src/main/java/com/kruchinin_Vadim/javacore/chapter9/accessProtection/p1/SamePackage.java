package com.kruchinin_Vadim.javacore.chapter9.accessProtection.p1;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("конструктор этого же пакета");
        System.out.println("n = " + p.n);
        //System.out.println("n_pri = " + p.n_pri); // недоступно
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
