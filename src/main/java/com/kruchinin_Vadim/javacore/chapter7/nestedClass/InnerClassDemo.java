package com.kruchinin_Vadim.javacore.chapter7.nestedClass;
// связь с классом Outer
class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
/*
    В данном классе создан объект класса Outer. Через этот вызван метод test класса Outer.
    В методе test создается объект inner вложенного класса Inner, с помощью которого
    вызывается метод display
    Таким образом, в стороннем классе А был создан обьект класса B, с помощью которого был вызван метод,
    который в свою очередь реализовал создание обьекта вложенного класса C в методе внешнего класса B и
    вызвал через созданный объект метод вложенного класса C
 */
