package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            String s = "";
            int dd = countSeconds;
            while (true) {
                s += countSeconds + " ";
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countSeconds--;
                if(countSeconds == 0 && dd == 3) {
                    System.out.println(s + "Марш!");
                    break;
                } else if (countSeconds == 0 && dd == 4) {
                    System.out.println(s + "Прервано!");
                    break;
                }
            }
        }
    }
}
