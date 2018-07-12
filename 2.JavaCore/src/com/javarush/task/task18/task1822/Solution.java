package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        String id = args[0];
        try (BufferedReader filereader = new BufferedReader(new FileReader(new File(fileName)))) {
            String line = filereader.readLine();
            while (line != null) {
                if(line.startsWith(id + " ")) {
                    System.out.println(line);
                    break;
                }
            }
        }
    }
}
