package com.mjc813.report5;

import java.util.List;

public class Report5Sort implements Runnable {
    private List<Integer> list;
    public Report5Sort(List<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {
        this.list.stream().sorted().forEach((x) -> {
            System.out.println("Report5Sort : " + x );
        });
    }
}
