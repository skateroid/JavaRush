package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();
    public static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        //String fileName = "x:/1.txt";
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()) {
            stringBuilder.append(fileReader.readLine() + " ");
        }
        String string = stringBuilder.toString();
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length ; j++) {
                StringBuilder buf = new StringBuilder();
                buf.append(strings[j]);
                buf.reverse();
               if (strings[i].equalsIgnoreCase(buf.toString()))  {
                   Pair pair = new Pair(strings[i],strings[j]);
                   result.add(pair);
                   strings[i] = String.valueOf(Math.random()*5);
                   strings[j] = String.valueOf(Math.random()*100);
                   break;
               }
            }
        }
        //System.out.println(stringBuilder.toString().trim());
        for (Pair p: result) {
            System.out.println(p.toString());
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public Pair() {

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
