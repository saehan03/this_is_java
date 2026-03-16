package com.mjc813.report5;

import java.util.List;

public class Report5Avg implements Runnable {
    private List<Integer> list;
    public Report5Avg(List<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {
        Integer sum = this.list.stream().reduce(0, (x, y) -> x + y);
        Double avg = Double.parseDouble(sum.toString()) / this.list.size();
        System.out.println("Report5Avg : " + avg);
    }
}
