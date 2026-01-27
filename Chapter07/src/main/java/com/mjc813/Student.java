package com.mjc813;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Student {
    private String student;
    private String subject;
    private int score;

    public Student() {
        this.setStudent("홍길동");
        this.setSubject("수학");
        this.setScore(90);
    }

    public String getInfo() {
        return String.format("학생의 성적: ", this.setStudent("홍길동"), this.setSubject("수학"), this.setScore(90));
    }
//
//    public void method1() {
//        System.out.println("홍길동");
//    }
//    public void method2() {
//        System.out.println("김남길");
//    }
}

