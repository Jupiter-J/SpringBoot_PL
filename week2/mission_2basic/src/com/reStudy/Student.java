package com.reStudy;

public class Student extends AbstractPerson {

    public Student(String name, int age) {
        //상속받은 부모객체를 호출
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(String.format("My name is %s, and I am a student.", getName()));
    }
}
