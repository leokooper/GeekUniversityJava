/*->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->-/
 *  Java Core. Professional Level                                                                      *
 *  Homework 7. Reflections API and Annotations                                                        *
 *                                                                                                     *
 *  @author Igor Leonchenko                                                                            *
 *  @param url https://github.com/leokooper                                                            *
 *  @version 15.03.2018                                                                                *
 /-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-*/

package ru.javacore.pl.leonchenko.homework7.utils;

public class TestClass {

    @Test(priority = 1)
    public static void t1(){
        System.out.println("t1");
    }

    @Test(priority = 4)
    public static void t2() {
        System.out.println("t2");
    }

    @Test (priority = 9)
    public static void t3(){
        System.out.println("t3");
    }

    @BeforeSuite
    public static void tBefore(){
        System.out.println("tBefore");
    }

    @AfterSuite
    public static void tAfter(){
        System.out.println("tAfter");
    }
}
