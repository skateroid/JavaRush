package com.javarush.task.task06.task0619;

/* 
Три статические переменных name
*/

public class Solution {
   public static String  name;
    public static class Cat {
      public   static   String name = "fsdfsdfsdf";
    }

    public static class Dog {
       public static  String name = "213123";
    }

    public static void main(String[] args) {
        System.out.println(Cat.name);
    }
}
