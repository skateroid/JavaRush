package com.javarush.task.task20.task2025;

import java.util.ArrayList;

/*
Алгоритмы-числа
*/
public class Solution {
    public static Long[] getNumbers(long N) {
      //  long[] result = null;
        ArrayList<Long> longList = new ArrayList<>();
        for (long i = 1; i <= N; i++) {
            String buff = String.valueOf(i);
            String[] strings = buff.split("");
            ArrayList<Short> list = new ArrayList<>();
            for (String s : strings) {
                list.add(Short.valueOf(s));
            }
            long buf = 0;
            for (int j = 0; j < list.size(); j++) {
                long sum = 1;
                for (int k = 0; k < list.size(); k++) {
                    sum *= list.get(j);
                }
                buf += sum;
            }
            if (buf == i) {
                longList.add(buf);
               // System.out.println(buf);
            }
        }
        return longList.toArray(new Long[longList.size()]);
    }

    public static void main(String[] args) {
        System.out.println(getNumbers(95995).toString());
    }
}
