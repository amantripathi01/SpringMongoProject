// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class Student_getStudentname_b7193f1cfc_Test {

    @Test
    public void testGetStudentname() {
        Student student = new Student();
        student.setStudentname("John Doe");
        String expected = "John Doe";
        String actual = student.getStudentname();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStudentnameWithEmptyString() {
        Student student = new Student();
        student.setStudentname("");
        String expected = "";
        String actual = student.getStudentname();
        assertEquals(expected, actual);
    }
}
