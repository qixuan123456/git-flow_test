package org.example;

import java.util.Objects;

public class Student extends People{

    public Student() {
    }

    public Student(int id, String name, String sex, int age) {
        super(id, name, sex, age);
    }
    public void study(){
        System.out.println(getName()+"在学习！");
    }
}
