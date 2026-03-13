package com.mjc813.report3;

public class Report3Main {
    public static void main(String[] args) {

        Thread rp3_1 = new Thread(new Report3_4to6());
        rp3_1.start();

        Thread rp3 = new Thread(new Report3_7to9());
        rp3.start();

        for (int dan = 2; dan <= 3; dan++) {
            for(int num = 1; num<=9; num++) {
                System.out.println(String.format("%d * %d = %d", dan, num, dan*num));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
