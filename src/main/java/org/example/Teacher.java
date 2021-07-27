package org.example;

public class Teacher extends People{

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, int age) {
        super(id, name, sex, age);
    }
    public void teach(){
        System.out.println(getName()+"在上课！");
    }
}
