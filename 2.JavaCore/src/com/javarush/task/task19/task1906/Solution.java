package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);
        while (fileReader.ready()) {
           // int data = fileReader.read();
           // fileWriter.write(data);
            char[] arr = new char[2];
            /*int data =*/ fileReader.read(arr);
            fileWriter.write(arr, 1, 1);
            fileWriter.flush();
        }
        fileReader.close();
        fileWriter.close();
    }
}
