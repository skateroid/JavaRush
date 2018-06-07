package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];
        //String fileName1 = "c:/1.txt";
        //String fileName2 = "c:/2.txt";
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName1))
            ) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] strings = line.split(" ");
                for (String s : strings) {
                    if (s.length() > 6) stringBuilder.append(s + ",")
                        /*writer.write(s + ",")*/;
                }
            }
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            String string = stringBuilder.substring(0, stringBuilder.length() - 1).toString();
            writer.write(string);
        }
    }
}
