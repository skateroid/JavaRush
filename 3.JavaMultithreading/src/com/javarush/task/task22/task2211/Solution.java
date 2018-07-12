package com.javarush.task.task22.task2211;

import java.io.*;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(args[0]), "Windows-1251");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(args[1]), "UTF-8");
        while (inputStreamReader.ready()) {
            outputStreamWriter.write(inputStreamReader.read());
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }
}
