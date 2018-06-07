package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        String[] strings = result.split("\n");
        System.setOut(consoleStream);
        for (int i = 0; i < strings.length; i++) {
            if ((i % 2 == 1) && (i != 0)) strings[i] = strings[i] + "\n" + "JavaRush - курсы Java онлайн" + "\n";
            else strings[i] = strings[i] + "\n";
            System.out.print(strings[i]);
            /*strings[i] = strings[i] + "\n" + "JavaRush - курсы Java онлайн";*/
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
