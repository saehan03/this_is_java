package com.mjc813;

public class PrintThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("실행 중");
            if(Thread.interrupted()) {
                break;
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
//    private boolean stop;

//    public void setStop(boolean stop) {
//        this.stop = stop;
//    }

//    @Override
//    public void run() {
//        try {
//            while (true) {
//                System.out.println("실행 중");
//                Thread.sleep(1);
//            }
//        } catch (InterruptedException e) {
//        }
//        System.out.println("리소스 정리");
//        System.out.println("실행 종료");
//    }
}
