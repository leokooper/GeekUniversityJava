/*->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->-/
 *  Java Core. Professional Level                                                                      *
 *  Homework 4. Multithreading. Part 1                                                                 *
 *                                                                                                     *
 *  @author Igor Leonchenko                                                                            *
 *  @param url https://github.com/leokooper                                                            *
 *  @version 05.03.2018                                                                                *
 /-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-*/

package ru.javacore.pl.leonchenko.homework4;
import ru.javacore.pl.leonchenko.homework4.utils.MFU;
import ru.javacore.pl.leonchenko.homework4.utils.ThreeThreadABC;
import ru.javacore.pl.leonchenko.homework4.utils.ThreeThreadsToFile;

public class Main {

    public static void main(String[] args) {

    ThreeThreadABC t = new ThreeThreadABC();
    ThreeThreadsToFile tt = new ThreeThreadsToFile();
    MFU ttt = new MFU();

    t.threeThreadABCTest();
    tt.threeThreadsToFileTest();
    ttt.mfuTest(10);

    }
}
