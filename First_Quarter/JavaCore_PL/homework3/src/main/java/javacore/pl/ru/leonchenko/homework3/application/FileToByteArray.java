package javacore.pl.ru.leonchenko.homework3.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileToByteArray {
    public void fileToByteArrayMethod() {
        File file = new File("src/main/java/javacore/pl/ru/leonchenko/homework3/srcfiles/inputfile_ex1.txt");
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(file);

            byte fileContent[] = new byte[(int)file.length()];

            fin.read(fileContent);
            String s = new String(fileContent);
            System.out.println("File content: " + s);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while reading file: " + ioe);
        }
        finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }
}
