// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_setStudentname_e4841ead99_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSetStudentname() {
        String expectedName = "John Doe";
        student.setStudentname(expectedName);
        Assertions.assertEquals(expectedName, student.getStudentname());
    }

    @Test
    public void testSetStudentname_WithNull() {
        String expectedName = null;
        student.setStudentname(expectedName);
        Assertions.assertNull(student.getStudentname());
    }

    @Test
    public void testSetStudentname_WithEmptyString() {
        String expectedName = "";
        student.setStudentname(expectedName);
        Assertions.assertEquals(expectedName, student.getStudentname());
    }
}
