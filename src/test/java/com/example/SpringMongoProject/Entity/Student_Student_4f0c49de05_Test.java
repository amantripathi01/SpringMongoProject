// Test generated by RoostGPT for test gitlab using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Student_Student_4f0c49de05_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testConstructorAndGetters() {
        student = new Student("1", "John Doe", "123 Street", "1234567890");

        assertEquals("1", student.get_id());
        assertEquals("John Doe", student.getStudentname());
        assertEquals("123 Street", student.getStudentaddress());
        assertEquals("1234567890", student.getMobile());
    }

    @Test
    public void testSettersAndToString() {
        student.set_id("2");
        student.setStudentname("Jane Doe");
        student.setStudentaddress("456 Street");
        student.setMobile("0987654321");

        String expected = "Student{" + "_id='" + "2" + '\'' + ", studentname='" + "Jane Doe" + '\'' + ", studentaddress='" + "456 Street" + '\'' + ", mobile='" + "0987654321" + '\'' + '}';
        assertEquals(expected, student.toString());
    }
}
