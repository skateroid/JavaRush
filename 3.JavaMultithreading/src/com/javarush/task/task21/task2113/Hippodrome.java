package com.javarush.task.task21.task2113;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException{
        game = new Hippodrome(Arrays.asList(
                new Horse("Alena", 3, 0),
                new Horse("Eva", 3, 0),
                new Horse("Polina", 3, 0)));
        game.run();
        game.printWinner();
    }
    public void run() throws InterruptedException{
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move() {
        for (Horse h : horses) {
            h.move();
        }
    }
    public void print() {
        for (Horse h : horses) {
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    public Horse getWinner() {
        Horse winner_horse = horses.get(0);
        for (Horse h : horses) {
            if (h.getDistance() > winner_horse.getDistance()) winner_horse = h;
        }
        return winner_horse;
    }

    public void printWinner() {
        System.out.format("Winner is %s!", getWinner().getName());
    }
}
