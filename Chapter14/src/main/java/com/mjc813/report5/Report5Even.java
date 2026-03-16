package com.mjc813.report5;

import java.util.Comparator;
import java.util.List;

public class Report5Even implements Runnable{
    private List<Integer> list;
    public Report5Even(List<Integer> list){
        this.list = list;
    }


    @Override
    public void run() {
        this.list.stream()
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .forEach((x) -> {
                    System.out.println("Report5Even : " + x );
                });
    }
}
