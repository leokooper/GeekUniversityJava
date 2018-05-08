package javacore.pl.ru.leonchenko.homework3.main;

import javacore.pl.ru.leonchenko.homework3.application.ConcatenationFiveToOne;
import javacore.pl.ru.leonchenko.homework3.application.FileToByteArray;
import javacore.pl.ru.leonchenko.homework3.application.ReadBigFile;

public class Main {
    public static void main(String[] args) throws Exception {
        //Exercise #1 example
        FileToByteArray app = new FileToByteArray();
        app.fileToByteArrayMethod();

        //Exercise #2 example
        ConcatenationFiveToOne con = new ConcatenationFiveToOne();
        con.concatenationFiveToOneMethod();

        //Exercise #3 example
        ReadBigFile rbf = new ReadBigFile();
        rbf.readBigFile();
    }

}
