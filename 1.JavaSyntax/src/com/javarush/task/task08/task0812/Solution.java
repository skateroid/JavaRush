package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> rr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rr.add(sc.nextInt());
        }
        int MaxSco = 0;
        int sco = 1;
        for (int i = 0; i < rr.size() - 1; i++) {
            if (rr.get(i) == rr.get(i + 1)) sco++;
            else sco = 1;
            if (MaxSco < sco) {
                MaxSco = sco;

            }
        }
     //  if (MaxSco < sco) MaxSco = sco;
        System.out.println(MaxSco);
    }
}