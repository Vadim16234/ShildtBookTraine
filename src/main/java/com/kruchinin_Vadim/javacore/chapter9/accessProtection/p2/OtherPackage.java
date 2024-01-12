package com.kruchinin_Vadim.javacore.chapter9.accessProtection.p2;

import com.kruchinin_Vadim.javacore.chapter9.accessProtection.p1.Protection;

class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("конструктор из другого пакета");

        // доступно только для данного класса или пакета
//        System.out.println("n = " + p.n);

        // доступно только для данного класса
//        System.out.println("n_pri = " + p.n_pri);

        // доступно только для данного класса, подкласса или пакета
//        System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
