package com.javarush.task.task28.task2805;

public class MyThread extends Thread {
    private static int priority = 0;

    private int upPriority() {
        priority++;
        if (priority > MAX_PRIORITY) priority = 1;
        return priority;
    }

    public MyThread() {
        this.setPriority(upPriority());
    }

    public MyThread(Runnable target) {
        super(target);
        this.setPriority(upPriority());
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        this.setPriority(upPriority());
    }

    public MyThread(String name) {
        super(name);
        this.setPriority(upPriority());
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        this.setPriority(upPriority());
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        this.setPriority(upPriority());
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        this.setPriority(upPriority());
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        this.setPriority(upPriority());
    }
}
