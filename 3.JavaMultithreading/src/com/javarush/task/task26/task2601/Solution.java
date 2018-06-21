package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
         sort(new Integer[] {2, 4, 12, 4, 22, 5, 14, 19, 20, 24, 1, 0});
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        List<Integer> sortedList = Arrays.stream(array).sorted().collect(Collectors.toList());
        Integer mediana;
        int seredina = sortedList.size() / 2;
        Arrays.sort(array);
        if (sortedList.size() % 2 == 0) {
            mediana = (sortedList.get(seredina - 1) + sortedList.get(seredina)) / 2;
        } else {
            mediana = sortedList.get(seredina);
        }
        Comparator<Integer> compMedian = Comparator.comparingInt(o -> Math.abs(o - mediana));
        Arrays.sort(array, compMedian);
        return array;
    }
}
