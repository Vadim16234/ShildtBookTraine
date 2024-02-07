package com.kruchinin_Vadim.javacore.chapter15.refConstractFabricClass;

class ConstructorRefDemo3 {
    // Фабричный метод для объектов разных классов. У каждого класса должен быть свой конструктор, принимающий один
    // параметр типа Т. А параметр R обозначает тип создаваемого объекта
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор класса МyClass. В данном случае оператор new обращается к конструктору,
        // принимающему аргумент
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

        // создать экземпляр типа класса МyClass, используя фабричный метод
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);

        // использовать только что созданный экземпляр класса МyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        // А теперь создать экземпляр другого класса, используя метод myClassFactory()
        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        // создать экземпляр класса МyClass2, используя фабричный метод
        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда ");

        // использовать только что созданный экземпляр класса МyClass
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());
    }
}
