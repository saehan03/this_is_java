package com.mjc813;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.Arrays;

public class MapEx {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()
                .forEach(d -> System.out.println(d));

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach(obj -> System.out.println(obj.intValue()));
    }
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("홍길동", 85));
//        studentList.add(new Student("홍길동", 92));
//        studentList.add(new Student("홍길동", 87));
//
//        studentList.stream()
//                .mapToInt(s -> s.getScore())
//                .forEach(score -> System.out.println(score));
//    }
}
