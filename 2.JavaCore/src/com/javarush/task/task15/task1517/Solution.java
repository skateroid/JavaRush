package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/


import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        if (A == 0)
        throw new ArithmeticException();
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
