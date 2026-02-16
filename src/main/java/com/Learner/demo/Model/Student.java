package com.Learner.demo.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    String name;
    int roll;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
