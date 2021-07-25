package com.anukul.demo.model;

import java.util.UUID;

public class Student {
    private final UUID;
    private final String firstName;
    private final String lastName;
    private final String course;
    private final Integer age;

    public Student(String firstName, String lastName, String course, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }

    public Integer getAge() {
        return age;
    }
}
