package com.javarush.task.task13.task1319;

import java.io.*;

import static java.lang.System.out;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String l;
        BufferedWriter bw = new BufferedWriter(new FileWriter(reader.readLine()));
        while (true) {
            l = reader.readLine();
            bw.write(l);
            if (l.equals("exit")) break;
            bw.write("\n");
        }
        reader.close();
        bw.close();
    }
}
