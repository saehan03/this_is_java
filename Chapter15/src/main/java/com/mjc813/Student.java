package com.mjc813;

public class Student {
    public int studentNum;
    public String name;

    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            return target.name.equals(name) && (target.studentNum==studentNum);
        } else {
            return false;
        }
    }
}
