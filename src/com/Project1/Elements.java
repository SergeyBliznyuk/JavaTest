package com.Project1;

public class Elements extends Thread {

    private volatile boolean NonStop = true;

    public void run() {
        while (NonStop) {
            System.out.println("Hello");

            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String exit() {
        NonStop = false;
        return "You are quited soon";
    }
}
