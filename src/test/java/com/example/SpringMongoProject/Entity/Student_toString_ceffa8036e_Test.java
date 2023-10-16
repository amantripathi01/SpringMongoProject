// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_toString_ceffa8036e_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testToStringWithAllFields() {
        student.set_id("1234");
        student.setStudentname("John Doe");
        student.setStudentaddress("123 Main St");
        student.setMobile("1234567890");

        String expected = "Student{" +
                "_id='1234'" +
                ", studentname='John Doe'" +
                ", studentaddress='123 Main St'" +
                ", mobile='1234567890'" +
                '}';
        assertEquals(expected, student.toString());
    }

    @Test
    public void testToStringWithNoFields() {
        String expected = "Student{" +
                "_id='null'" +
                ", studentname='null'" +
                ", studentaddress='null'" +
                ", mobile='null'" +
                '}';
        assertEquals(expected, student.toString());
    }
}
