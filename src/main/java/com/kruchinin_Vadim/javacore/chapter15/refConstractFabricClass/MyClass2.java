package com.kruchinin_Vadim.javacore.chapter15.refConstractFabricClass;

// простой необобщенный класс
class MyClass2 {
    String str;

    MyClass2(String s) {
        str = s;
    }

    MyClass2() {
        str = "";
    }

    public String getVal() {
        return str;
    }
}
