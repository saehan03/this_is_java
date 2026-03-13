package com.mjc813;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1(29);

        Thread3 th3 = new Thread3();
        for ( int i = 0; i < 99; i++ ) {
            try {
                Thread.sleep(300); // 90% 많이 사용된다.
            } catch (InterruptedException e) {
            }
            try {
                th1.start();
                // 스레드는 start 하고 종료되면 다시 start 할 수 없다.
                // 다시 시작하려면 new 를 하고 start 해야 한다.
            } catch (Exception e) {
                System.err.println(e.toString());
            }
            System.out.println(String.format("%s, i = %d", Thread.currentThread().getName(), i));
            if ( i % 10 == 0 ) {
                th3.testThread3();
            }
        }
        //스레드실행
        th3.close();

    }
}