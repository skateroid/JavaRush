package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        return a;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        return b;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        return c;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        boolean d = sc.nextBoolean();
        return d;

    }

    public static void main(String[] args) {

    }
}
