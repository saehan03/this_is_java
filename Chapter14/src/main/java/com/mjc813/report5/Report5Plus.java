package com.mjc813.report5;

import java.util.List;

public class Report5Plus implements Runnable {
    private List<Integer> list;
    public Report5Plus(List<Integer> list){
        this.list = list;
    }

        @Override
        public void run() {
            Integer sum = this.list.stream().reduce(0, (x, y) -> x + y);
            System.out.println("Report5Plus : " + sum);
        }
}

