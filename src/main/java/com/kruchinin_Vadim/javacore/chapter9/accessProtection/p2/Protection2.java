package com.kruchinin_Vadim.javacore.chapter9.accessProtection.p2;

import com.kruchinin_Vadim.javacore.chapter9.accessProtection.p1.Protection;

class Protection2 extends Protection {
    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");
        //System.out.println("n = " + n);
        //System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
