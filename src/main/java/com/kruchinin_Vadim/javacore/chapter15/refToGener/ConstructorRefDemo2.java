package com.kruchinin_Vadim.javacore.chapter15.refToGener;

class ConstructorRefDemo2 {
    public static void main(String[] args) {
        // создать ссылку на конструктор обощенного класса MyClass<T>
        MyFunc<Integer> myClassCons = MyClass<Integer>::new;

        // создать экземпляр класса MyClass<T>
        MyClass<Integer> mc = myClassCons.func(100);

        // воспользоваться только что созданным экземпляром класса MyClass<T>
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
