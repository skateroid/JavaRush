package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) throws ArithmeticException {
        try {
            divisionByZero(); }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void divisionByZero() {
        int z = 5 / 0;
        System.out.println(z);
    }
}