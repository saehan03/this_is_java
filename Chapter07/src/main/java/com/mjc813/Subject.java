package com.mjc813;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Subject extends Student {

    private String Student;
    private String Subject;

    public void Subject() {
        this.setStudent("");
        this.setSubject("");
    }

    public Subject( String Student, String Subject, int Score ) {
        super(Student, Subject, Score);
        this.setStudent(getStudent());
        this.setSubject(getSubject());
    }

//    @Override
//    public String getInfo() {
//        return String.format("");
    }
//    public void method1() {
//        System.out.println("홍길동" + ", 수학");
//    }
//
//    public void method2() {
//        System.out.println("김남길" + ", 과학");
//    }

