package javacore.pl.ru.leonchenko.homework3.application;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ConcatenationFiveToOne {
    public void concatenationFiveToOneMethod() throws Exception {

        FileInputStream fis1 = new FileInputStream("src/main/java/javacore/pl/ru/leonchenko/homework3/srcfiles/inputfile_ex2_pt1.txt");
        FileInputStream fis2 = new FileInputStream("src/main/java/javacore/pl/ru/leonchenko/homework3/srcfiles/inputfile_ex2_pt2.txt");
        FileInputStream fis3 = new FileInputStream("src/main/java/javacore/pl/ru/leonchenko/homework3/srcfiles/inputfile_ex2_pt3.txt");
        FileInputStream fis4 = new FileInputStream("src/main/java/javacore/pl/ru/leonchenko/homework3/srcfiles/inputfile_ex2_pt4.txt");
        FileInputStream fis5 = new FileInputStream("src/main/java/javacore/pl/ru/leonchenko/homework3/srcfiles/inputfile_ex2_pt5.txt");

        ArrayList<InputStream> al = new ArrayList<InputStream>();;
        al.add(fis1);
        al.add(fis2);
        al.add(fis3);
        al.add(fis4);
        al.add(fis5);

        Enumeration<InputStream> e = Collections.enumeration(al);
        SequenceInputStream sis = new SequenceInputStream(e);

        int byteRead;
        while ((byteRead = sis.read()) != -1) {
            System.out.write(byteRead);
        }
        System.out.flush();
    }
}
