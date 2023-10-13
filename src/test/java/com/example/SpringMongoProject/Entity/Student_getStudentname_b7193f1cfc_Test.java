// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_getStudentname_b7193f1cfc_Test {

    @Test
    public void testGetStudentName() {
        Student student = new Student();
        student.setStudentname("John Doe");
        assertEquals("John Doe", student.getStudentname());
    }

    @Test
    public void testGetStudentName_Empty() {
        Student student = new Student();
        student.setStudentname("");
        assertEquals("", student.getStudentname());
    }
}
