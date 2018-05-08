/*->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->-/
 *  Java Core. Professional Level                                                                      *
 *  Homework 4. Multithreading. Part 1                                                                 *
 *                                                                                                     *
 *  @author Igor Leonchenko                                                                            *
 *  @param url https://github.com/leokooper                                                            *
 *  @version 05.03.2018                                                                                *
 /-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-*/

package ru.javacore.pl.leonchenko.homework4.utils;

public class ThreeThreadABC {
        private final Object obj = new Object();
        private volatile char letter = 'A';

        public void printLetterA() {
            synchronized (obj) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (letter != 'A') obj.wait();
                        System.out.print("A");
                        letter = 'B';
                        obj.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        public void printLetterB() {
            synchronized (obj) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (letter != 'B') obj.wait();
                        System.out.print("B");
                        letter = 'C';
                        obj.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        public void printLetterC() {
            synchronized (obj) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (letter != 'C') obj.wait();
                        System.out.print("C");
                        letter = 'A';
                        obj.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void threeThreadABCTest() {
            new Thread(() -> printLetterA()).start();
            new Thread(() -> printLetterB()).start();
            new Thread(() -> printLetterC()).start();
        }

}
