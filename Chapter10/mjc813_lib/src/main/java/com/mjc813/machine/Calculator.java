package com.mjc813.machine;

public class Calculator {
    public long add(int ... items) {

        long result = 0L;
//        for(int n = 0; n < items.length; n++) {
//            result += items[n];
//        }
        for (int n : items ) {
            result += n;
        }
        return result;
    }
}
