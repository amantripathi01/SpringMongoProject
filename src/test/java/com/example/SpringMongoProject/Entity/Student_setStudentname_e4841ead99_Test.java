// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_setStudentname_e4841ead99_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSetStudentName_ValidName() {
        String expectedName = "John Doe";
        student.setStudentname(expectedName);
        assertEquals(expectedName, student.getStudentname());
    }

    @Test
    public void testSetStudentName_NullName() {
        String expectedName = null;
        student.setStudentname(expectedName);
        assertEquals(expectedName, student.getStudentname());
    }
}
