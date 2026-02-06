package com.mjc813;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

//        set.add(new Member("홍길동", 30));
//        set.add(new Member("홍길동", 30));

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("JSP")) {
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        for(String element : set) {
            System.out.println(element);
        }

//        int size = set.size();
//        System.out.println("총 객체 수: " + set.size());
    }
}
