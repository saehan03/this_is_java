package com.mjc813;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Arrays;

public class StreamEx {
        public static int sum;

        public static void main(String[] args) {
            IntStream stream = IntStream.rangeClosed(1, 100);
            stream.forEach(a -> sum += a);
            System.out.println("총합: " + sum);
        }
//        String[] strArray = { "홍길동", "신용권", "김미나"};
//        Stream<String> strStream = Arrays.stream(strArray);
//        strStream.forEach(item -> System.out.print(item + ","));
//        System.out.println();
//
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        IntStream intStream = Arrays.stream(intArray);
//        intStream.forEach(item -> System.out.print(item + ","));
//        System.out.println();

//        List<Product> list = new ArrayList<>();
//        for(int i=1; i<=5; i++) {
//            Product product = new Product(i, "상품"+i, "멋진 회사", (int) (10000*Math.random()));
//            list.add(product);
//        }
//
//        Stream<Product> stream = list.stream();
//        stream.forEach(p -> System.out.println(p));
//        Set<String> set = new HashSet<>();
//        set.add("홍길동");
//        set.add("신용권");
//        set.add("감자바");
//
//        Stream<String> stream = set.stream();
//        stream.forEach(name->System.out.println(name));
//    }
}
