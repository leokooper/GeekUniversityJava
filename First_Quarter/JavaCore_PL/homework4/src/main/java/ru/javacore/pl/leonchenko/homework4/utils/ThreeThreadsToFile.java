/*->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->-/
 *  Java Core. Professional Level                                                                      *
 *  Homework 4. Multithreading. Part 1                                                                 *
 *                                                                                                     *
 *  @author Igor Leonchenko                                                                            *
 *  @param url https://github.com/leokooper                                                            *
 *  @version 05.03.2018                                                                                *
 /-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-*/

package ru.javacore.pl.leonchenko.homework4.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ThreeThreadsToFile {

    private Object m = new Object();

    public void printToFile(String s) {
        for (int i = 0; i < 10; i++) {
            synchronized (m) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/EXCERCISE2TEST.txt", true))) {
                    bw.write(s);
                    bw.newLine();
                    System.out.println(s + " printing");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void threeThreadsToFileTest(){
        new Thread(() -> printToFile("Thread1TestText")).start();
        new Thread(() -> printToFile("Thread2TestText")).start();
        new Thread(() -> printToFile("Thread3TestText")).start();
    }
}
