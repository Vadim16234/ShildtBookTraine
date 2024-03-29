package com.kruchinin_Vadim.javacore.chapter13.readingSymbols;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Использовать класс BufferedReader для чтения символов с консоли

/*
    В приведенном ниже примере программы демонстрируется применение метода read() для чтения символов с консоли
до тех пор, пока пользователь не введет символ "q". Следует заметить, что любые исключения, возникающие при
вводе/выводе, просто генерируются в методе main(). Такой подход растространен при чтении данных с консоли в
простых примерах программ, аналогичных представленным в этой книге, но в более сложных прикладных программах
исключения можно обрабатывать явным образом.
 */
class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' - для выхода.");
        // читать символы
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
/*
    Результат выполнения данной программы может выглядеть не совсем так, как предполагалось, потому что стандартный
поток ввода System.in по умолчанию является буферизованным построчно. Это означает, что никакие вводимые данные
на самом деле не передаются программе до тех пор, пока не будет нажата клавиша <Enter>. Нетрудно догадаться,
что эта особенность делает метод read() малопригодным для организации ввода с консоли в диалоговом режиме.
 */
