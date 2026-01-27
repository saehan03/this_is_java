package com.mjc813;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Phone {

    public String model;
    public String color;

    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }
}
