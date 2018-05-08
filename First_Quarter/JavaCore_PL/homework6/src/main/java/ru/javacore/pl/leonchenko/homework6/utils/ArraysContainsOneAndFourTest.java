/*->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->-/
 *  Java Core. Professional Level                                                                      *
 *  Homework 6. Dev Tools Overview                                                                     *
 *                                                                                                     *
 *  @author Igor Leonchenko                                                                            *
 *  @param url https://github.com/leokooper                                                            *
 *  @version 12.03.2018                                                                                *
 /-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-*/

package ru.javacore.pl.leonchenko.homework6.utils;

public class ArraysContainsOneAndFourTest {
    public static boolean arraysContainsOneAndFourTestMethod(int[] arr){
        boolean INCLUDES_ONE = false;
        boolean INCLUDES_FOUR = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) INCLUDES_ONE = true;
                else if (arr[i] == 4) INCLUDES_FOUR = true;
                else return false;
            }
            return INCLUDES_ONE && INCLUDES_FOUR;
        }
    }