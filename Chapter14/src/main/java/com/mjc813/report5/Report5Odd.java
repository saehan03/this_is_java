package com.mjc813.report5;

public class Report5Odd extends Thread{
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
                    System.out.print(targetChar);
                }
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
        }
    }
}
