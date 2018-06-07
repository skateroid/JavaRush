package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        List<String> towns = new ArrayList<>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;
            towns.add(town);
            addresses.add(family);

        }
        String curTown = reader.readLine();
        for (int i = 0; i < towns.size(); i++) {
            if (curTown.equals(towns.get(i))) {
                System.out.println(addresses.get(i));
                break;
            }

        }

    }
}
