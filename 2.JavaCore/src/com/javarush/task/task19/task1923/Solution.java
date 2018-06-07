package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];
       // String fileName1 = "c:/1.txt";
       // String fileName2 = "c:/2.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))){
            while (reader.ready()) {
                String line = reader.readLine();
                String[] strings = line.split(" ");
                for (String s : strings) {
                    String buff = s.replaceAll("(\\d)"/*"(^\\D+)|([^0-9])"*/, "");
                    if (s.length() != buff.length()) writer.write(s + " ");
                }
            }
        }
    }
}
