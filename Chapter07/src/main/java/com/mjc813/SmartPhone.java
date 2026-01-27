package com.mjc813;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SmartPhone extends Phone {

    public SmartPhone(String model, String color) {
        super(model, color);
//        this.setModel(model);
//        this.setColor(color);
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
