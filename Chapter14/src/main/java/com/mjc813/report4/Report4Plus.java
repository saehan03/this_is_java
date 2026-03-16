package com.mjc813.report4;

public class Report4Plus extends Thread {
    private volatile char targetChar;
    private volatile boolean running = false;

    public void setTargetChar(char c) {
        this.targetChar = c;
        this.running = true;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                if (running) {
                    System.out.println(targetChar);
                }
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
        }
    }
}
