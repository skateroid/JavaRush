package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while((key = reader.readLine()).equals("user")||
                (key.equals("loser"))||
                (key.equals("coder"))||
                (key.equals("proger")))
        {
            //создаем объект, пункт 2
            if (key.equals("user")) doWork(new Person.User());
            if (key.equals("loser")) doWork(new Person.Loser());
            if (key.equals("coder")) doWork(new Person.Coder());
            if (key.equals("proger")) doWork(new Person.Proger());//вызываем doWork
        }
    }

    public static void doWork(Person person) {
        // пункт 3
    if (person instanceof Person.User) {
         ((Person.User) person).live();
    }
    else if (person instanceof Person.Loser)
        ((Person.Loser) person).doNothing();
    else if (person instanceof Person.Coder)
        ((Person.Coder) person).coding();
    else if (person instanceof Person.Proger)
        ((Person.Proger) person).enjoy();
    }
}
