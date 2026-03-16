package com.mjc813.report5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Report5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            String[] split = input.split(",");
            int[] intArray = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
            List<Integer> list = Arrays.stream(intArray).boxed().collect(Collectors.toList());

            Thread rp5 = new Thread(new Report5Plus(list));
            rp5.start();

            Thread rp5_1 = new Thread(new Report5Avg(list));
            rp5_1.start();

            Thread rp5_2 = new Thread(new Report5Sort(list));
            rp5_2.start();

            Thread rp5_3 = new Thread(new Report5Odd(list));
            rp5_3.start();

            Thread rp5_4 = new Thread(new Report5Even(list));
            rp5_4.start();
        }
    }
}
