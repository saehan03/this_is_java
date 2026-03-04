package com.mjc813;

import com.mjc813.lamda.LamdaUseInterface;
import com.mjc813.lamda.NormalUseInterface;

public class Main {
    public static void main(String[] args) {
        NormalUseInterface nui = new NormalUseInterface();
        nui.doSome();

        LamdaUseInterface lui = new LamdaUseInterface();
        lui.doSome( (str, n) -> {
            // 첫번째 기능
            System.out.println(str.length() == n ? str + " 같다 " + n : "다르다");
        }, "abc", 3 );
        // 두번째 기능 (같은 기능이라도 다른 곳에서 쓰려면 {}안에 것들을 다시 타이핑 해야한다.)
        lui.doSome( (sss, i) -> {
            for ( int m =0; m < i; m++) {
                System.out.print(sss);
            }
            System.out.println();
        }, "def", 3 );
    }
}