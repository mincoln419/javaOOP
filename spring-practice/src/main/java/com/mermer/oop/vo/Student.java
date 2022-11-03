package com.mermer.oop.vo;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
