/*->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->-/
 *  Java Core. Professional Level                                                                      *
 *  Homework 7. Reflections API and Annotations                                                        *
 *                                                                                                     *
 *  @author Igor Leonchenko                                                                            *
 *  @param url https://github.com/leokooper                                                            *
 *  @version 15.03.2018                                                                                *
 /-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-*/

package ru.javacore.pl.leonchenko.homework7.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;

public class TestProc {
    public static void start(Class c) {
        Method[] methods = c.getDeclaredMethods();
        ArrayList<Method> alm = new ArrayList<>();
        for (Method o: methods) {
            if(o.isAnnotationPresent(Test.class)) alm.add(o);
        }
        alm.sort(new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                int pr1 = o1.getAnnotation(Test.class).priority();
                int pr2 = o2.getAnnotation(Test.class).priority();
                return pr2 - pr1;
            }
        });

        for (Method o : methods) {
            if (o.isAnnotationPresent(BeforeSuite.class)) {
                if (alm.get(0).isAnnotationPresent(BeforeSuite.class))
                    throw new RuntimeException("Too much methods with annotation @BeforeSuite");
                alm.add(0, o);
            }
        }

        for (Method o : methods) {
            if (o.isAnnotationPresent(AfterSuite.class)) {
                if (alm.get(alm.size() - 1).isAnnotationPresent(AfterSuite.class))
                    throw new RuntimeException("Too much methods with annotation @AfterSuite");
                alm.add(o);
            }
        }

        try{
            for (Method o: alm){
                o.invoke(null);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong on testing!");
        }
    }
}
