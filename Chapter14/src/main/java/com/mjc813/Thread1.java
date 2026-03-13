package com.mjc813;

public class Thread1 extends Thread {
    public Thread1(int num) {
        this.num = num;
        this.setName("Thread1");
    }
    private int num;

    @Override
    public void run() {
        Thread th2 = new Thread(new Thread2()); // new 로 선언한다.
        th2.start();                            // start로 실행한다.

        for ( int i = 0; i < this.num; i++ ) {
            try {
                Thread.sleep(50);          // 주로 사용 sleep
            } catch (InterruptedException e) {
            }
            System.out.println(String.format("%s, i = %d", Thread.currentThread().getName(), i));
        }
    }
}
