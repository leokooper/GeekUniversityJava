/*->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->-/
 *  Java Core. Professional Level                                                                      *
 *  Homework 5. Multithreading. Part 2                                                                 *
 *                                                                                                     *
 *  @author Igor Leonchenko                                                                            *
 *  @param url https://github.com/leokooper                                                            *
 *  @version 08.03.2018                                                                                *
 /-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-*/

package ru.javacore.pl.leonchenko.homework5.utils;

public class StartMessage implements Runnable {
    @Override
    public void run() {
        System.out.println("ВАЖНОЕ ОБЪЯВЕНИЕ >>> Гонка началась!!!");
    }
}