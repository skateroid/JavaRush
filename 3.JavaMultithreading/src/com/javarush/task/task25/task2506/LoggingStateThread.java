package com.javarush.task.task25.task2506;

class LoggingStateThread extends Thread{
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        setDaemon(true);
    }

    @Override
    public void run() {
        State state = thread.getState();
        System.out.println(thread.getState());
        while (state!= state.TERMINATED) {
            if (state != thread.getState()) {
                state = thread.getState();
                System.out.println(thread.getState());
            }

        }

    }
}
