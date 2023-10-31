package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_toString_ceffa8036e_Test {

    @Test
    public void testToString() {
        Student student = new Student();
        student.set_id("1");
        student.setStudentname("John Doe");
        student.setStudentaddress("123 Street");
        student.setMobile("1234567890");
        String expected = "Student{" +
                "_id='1'" +
                ", studentname='John Doe'" +
                ", studentaddress='123 Street'" +
                ", mobile='1234567890'" +
                '}';
        Assertions.assertEquals(expected, student.toString());
    }

    @Test
    public void testToStringWithNullValues() {
        Student student = new Student();
        student.set_id(null);
        student.setStudentname(null);
        student.setStudentaddress(null);
        student.setMobile(null);
        String expected = "Student{" +
                "_id='null'" +
                ", studentname='null'" +
                ", studentaddress='null'" +
                ", mobile='null'" +
                '}';
        Assertions.assertEquals(expected, student.toString());
    }
}
