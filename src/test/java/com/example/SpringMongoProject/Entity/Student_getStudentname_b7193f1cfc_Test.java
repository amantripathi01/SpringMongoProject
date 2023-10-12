// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_getStudentname_b7193f1cfc_Test {

    private Student student;

    @BeforeEach
    public void setup() {
        student = new Student();
    }

    @Test
    public void testGetStudentName_ValidName() {
        String expectedStudentName = "John Doe";
        student.setStudentname(expectedStudentName);
        String actualStudentName = student.getStudentname();
        Assertions.assertEquals(expectedStudentName, actualStudentName, "The student name should match the expected value");
    }

    @Test
    public void testGetStudentName_EmptyName() {
        String expectedStudentName = "";
        student.setStudentname(expectedStudentName);
        String actualStudentName = student.getStudentname();
        Assertions.assertEquals(expectedStudentName, actualStudentName, "The student name should match the expected value");
    }
}
