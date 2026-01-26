package com.mjc813;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
