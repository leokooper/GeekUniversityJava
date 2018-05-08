import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

    //7 пример
    public static void a7() throws IOException {
        FileOutputStream out = new FileOutputStream("1.txt");
        out.close();
    }


    //5 пример
    static class Person {
        public Person (int age) {
        if (age < 14) throw new RuntimeException("Невозможно создать указанный профайл, некорректный возраст");
        }
    }


    //4 пример
    public static int sqrt(int n) {
        if (n > 0) {
            return n / 2;
        }
        throw new ArithmeticException("Невозможно взять квадратный корень из отрицательного числа!");
    }

    //6 пример
    static void a() {
        try{
            b();
        } catch (ArithmeticException e) {
            System.out.println("B");
        }
    }

    static void b() {
        int x = 10 / 0;
    }

    public static void main(String[] args) {
        try{
            a();
        } catch (ArithmeticException e) {
            System.out.println("B");
        }


        /*        a();
    }

    static void a() {
        b();
    }

    static void b() {
        c();
    }

    static void c() {
        int x = 10 / 0;*/
        try {
            int[] q = new int[5];
            q[20] = 20;
            int x = 10 / 0;
            System.out.println("e");
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение AE");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение AIOOBE");
        }
        System.out.println("END");

        try {
            FileInputStream in = new FileInputStream("in.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream out = new FileOutputStream("out.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //3 пример
        try {
            throw new RuntimeException("My custom exception!");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }System.out.println("111");

        //4 пример
        System.out.println(sqrt(5));

        //5 пример
        Person person = new Person(10);

    }



}