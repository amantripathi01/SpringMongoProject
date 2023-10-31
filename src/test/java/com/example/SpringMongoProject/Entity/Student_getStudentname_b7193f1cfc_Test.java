package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_getStudentname_b7193f1cfc_Test {

    private Student student = new Student();

    @Test
    public void testGetStudentName() {
        String expectedStudentName = "John Doe";
        student.setStudentname(expectedStudentName);
        String actualStudentName = student.getStudentname();
        assertEquals(expectedStudentName, actualStudentName, "Expected student name does not match actual student name");
    }

    @Test
    public void testGetStudentNameWhenNameIsNull() {
        student.setStudentname(null);
        String actualStudentName = student.getStudentname();
        assertEquals(null, actualStudentName, "Expected student name does not match actual student name");
    }
}
