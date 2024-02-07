package com.kruchinin_Vadim.javacore.chapter15.referenceToInstsnceMethod2;

class InstanceMethWithObjectRefDemo {
    // Метод, возвращающий количество экземпляров объекта, найденных по критериям, задаваемым параметром
    // функционального интерфейс MyFunc
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        // создать массив объектов типа HighTemp
        HighTemp[] weekDayHighs = {
                new HighTemp(89),
                new HighTemp(90),
                new HighTemp(89),
                new HighTemp(84),
                new HighTemp(82),
                new HighTemp(89),
                new HighTemp(91),
                new HighTemp(83)
        };

        // Использовать метод counter() вместе с массивами объектов типа HighTemp. Обратите внимание на то ,
        // что ссылка на метод экземпляра sameTemp() передается в качестве второго параметра
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была 89: " + count);

        // А теперь создать и использовать вместе с данным методом еще один массив объектов типа HighTemp
        HighTemp[] weekDayHighs2 = {
                new HighTemp(32),
                new HighTemp(24),
                new HighTemp(18),
                new HighTemp(-1),
                new HighTemp(12),
                new HighTemp(19),
                new HighTemp(12),
                new HighTemp(13)
        };

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Дней, когда максимальная температура была 12: " + count);

        // А теперь воспольемся методом lessThanTemp(), чтобы выяснить, сколько дней температура была меньше заданной
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была меньше 89: " + count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Дней, когда максимальная температура была меньше 19: " + count);
    }
}
/*
    В данном примере программы обратите внимание на то, что в классе HighTemp объявлены два метода экземпляра:
sameTemp() и lessThanTemp(). Первый метод возвращает логическое значение true, если оба объекта типа HighTemp содержат
одинаковую температуру. А второй метод возвращает логическое значение true, если температура в вызывающем объекте
меньше, чем в передаваемом. Каждый из этих методов принимает параметр типа HighTemp и возвращает логическое значение.
Следовательно, каждый из них совместим с функциональным интерфейсом MyFunc, поскольку тип вызывающего объекта может
быть приведен к типу первого параметра метода func() , а тип его аргумента - к типу второго параметра этого метода.
 */
