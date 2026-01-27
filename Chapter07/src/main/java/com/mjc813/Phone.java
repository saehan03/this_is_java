package com.mjc813;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Phone {

    public String model;
    public String color;

    public Phone(String model, String color) {
        this.setModel(model);
        this.setColor(color);
        System.out.println("Phone(String model, String color) 생성자 실행");
    }
}
