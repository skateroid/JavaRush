package com.javarush.task.task18.task1823;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        while (true) {
            filename = reader.readLine();
            if (filename.equals("exit")) break;
            ReadThread readThread = new ReadThread(filename);
            readThread.start();
            readThread.join();
        }

    }

    public static class ReadThread extends Thread {
        private String filename;
        ArrayList<Integer> list = new ArrayList<>();
        public ReadThread(String fileName) throws IOException {
            //implement constructor body
            this.filename = fileName;
            FileInputStream fileInputStream = new FileInputStream(fileName);
            while (fileInputStream.available() > 0) list.add(fileInputStream.read());
            fileInputStream.close();
        }

        @Override
        public void run() {
            int el = list.get(0);
            for (Integer i : list) {
                if (Collections.frequency(list, i) > Collections.frequency(list, el)) el = i;
            }
            resultMap.put(filename, el);
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
