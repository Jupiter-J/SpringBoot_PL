package com.reStudy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person student = new Student("Kim", 26);
        Person studentLee = new Student("Lee", 25);
        Student studentSu = new Student("Su", 25);

        Person lecturer = new Lecturer("Park Jeeho", 35);
        Lecturer lecturerLee = new Lecturer("Lee kim", 45);

        List<Person> everyone = new ArrayList<>();
        everyone.add(student);
        everyone.add(studentLee);
        everyone.add(studentSu);
        everyone.add(lecturer);
        everyone.add(lecturerLee);

        for (Person person : everyone) {
            person.speak();
        }

    }
}
