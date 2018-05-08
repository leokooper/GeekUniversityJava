package javacore.pl.ru.leonchenko.homework3.application;

import java.io.*;

public class ReadBigFile {
        public void readBigFile() {
            try (RandomAccessFile raf = new RandomAccessFile("src/main/java/javacore/pl/ru/leonchenko/homework3/srcfiles/inputfile_ex3.txt", "r");
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                long fileLength = raf.length();
                long pageLength = 1800;
                long pagesCount = fileLength/pageLength;
                byte[] b = new byte[1800];
                System.out.println("fileLength: " + fileLength + " | pageLength: " + pageLength + " | pagesCount: " + pagesCount);
                while (true) {
                    System.out.println("\nEnter the page between 0 and " + pagesCount + ". -1 to Exit.");
                    long p = Long.parseLong(br.readLine());
                    if (p <= pagesCount && p >= 0) {
                        raf.seek(p * pageLength);
                        raf.read(b, 0, b.length);
                        for (byte bb : b) System.out.print((char) bb);
                    } else if (p == -1) {
                        System.out.println("Bye!");
                        System.exit(0);
                    } else {
                        System.out.println("Incorrect page: " + p);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}
