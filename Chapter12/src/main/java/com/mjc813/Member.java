package com.mjc813;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class Member {
    private final String id;
    @NonNull private String name;
    private int age;

//    public Member(String id) {
//        this.id = id;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Member target) {
//            if(id.equals(target.id)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
