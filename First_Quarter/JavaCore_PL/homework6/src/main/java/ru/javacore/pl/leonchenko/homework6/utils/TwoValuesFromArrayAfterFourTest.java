/*->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->-/
 *  Java Core. Professional Level                                                                      *
 *  Homework 6. Dev Tools Overview                                                                     *
 *                                                                                                     *
 *  @author Igor Leonchenko                                                                            *
 *  @param url https://github.com/leokooper                                                            *
 *  @version 12.03.2018                                                                                *
 /-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-*/

package ru.javacore.pl.leonchenko.homework6.utils;
import java.util.Arrays;

public class TwoValuesFromArrayAfterFourTest {
    public static int[] twoValuesFromArrayAfterFourTestMethod(int[] arr){
        int STARTING_POSITION = 0;
        String str = Arrays.toString(arr);
        if (str.indexOf(String.valueOf(4)) != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) STARTING_POSITION = i;
            }
            int[] arr1 = new int[arr.length - STARTING_POSITION - 1];
            System.arraycopy(arr, STARTING_POSITION + 1, arr1, 0, arr1.length);
            return arr1;
        } else {
            throw new RuntimeException("Four is not found!");
        }
    }
}


