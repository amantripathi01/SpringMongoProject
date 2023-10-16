// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Student_setStudentname_e4841ead99_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSetStudentname_withValidName() {
        String validName = "John Doe";
        student.setStudentname(validName);
        assertEquals(validName, student.getStudentname());
    }

    @Test
    public void testSetStudentname_withNullName() {
        String nullName = null;
        student.setStudentname(nullName);
        assertEquals(null, student.getStudentname());
    }
}
