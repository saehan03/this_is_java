package com.mjc813;

import java.awt.*;

public class ContainerEx {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.setName("홍길동");
        String str = container1.getName();

        Container<Integer> container2 = new Container<>();
        container2.setAge(6);
        int value = container2.getAge();
    }
}
