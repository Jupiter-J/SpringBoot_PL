package com.reStudy;

public abstract class AbstractPerson implements Person {

    private String name;
    private int age;


    //생성자 Constructor
    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //인터페이스 함수를 구현 (implements Person)
    @Override
    public void speak() {
        System.out.println(String.format("Hi my name is %s,", this.name));
    }

    //private  상태에서 하위 클래스가 상위 객체를 사용하는 방법
    //변경 권한을 주지 않고 사용하는 방법
    public String getName() {
        return this.name;
    }

}
