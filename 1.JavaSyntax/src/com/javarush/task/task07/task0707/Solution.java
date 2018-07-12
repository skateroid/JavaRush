package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();
        list.add("sda");
        list.add("s23a");
        list.add("sd3233a");
        list.add("s3144da");
        list.add("s3131da");
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++) System.out.println(list.get(i));
    }
}
