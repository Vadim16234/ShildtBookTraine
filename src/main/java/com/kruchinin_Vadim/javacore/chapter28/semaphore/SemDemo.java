package com.kruchinin_Vadim.javacore.chapter28.semaphore;

import java.util.concurrent.Semaphore;

// Простой пример использования семафора
class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}
/*
    Для управления доступом к переменной count, которая является статической переменной класса Shared,
в данной програыме используется семафор. Значение переменной Shared.count увеличивается на 5 в методе run() из
класса IncThread и уменьшается на 5 в одноименном методе из класса DecThread. Для защиты потоков исполнения,
представленных этими двумя классами, от одновременного доступа к переменной Shared.count такой доступ предоставляется
только после того, как будет получено разрешение от управляющего семафора. По завершении доступа к данной переменной
как к общему ресурсу разрешение на него освобождается. Таким образом, только один поток исполнения может одновременно
получить доступ к переменной Shared.count, что и подтверждают результаты выполнения данной программы.
 */