package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static volatile boolean isSleq = true;
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new TestThread());
        t.start();
      //  isSleq = true;
        Thread.sleep(3000);
       // isSleq = false;
        ourInterruptMethod();

    }


    public static void ourInterruptMethod() {
        isSleq = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (isSleq) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
