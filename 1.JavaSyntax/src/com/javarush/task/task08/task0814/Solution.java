package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) set.add(i);
return  set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet<Integer> newSet = new HashSet<>();
        for (Integer i: set
             ) {
            if (i > 10) newSet.add(i);
        }
        set.removeAll(newSet);
return set;
    }

    public static void main(String[] args) {

    }
}
