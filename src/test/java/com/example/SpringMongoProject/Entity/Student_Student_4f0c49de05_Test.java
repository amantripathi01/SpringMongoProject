// Test generated by RoostGPT for test gitlab using AI Type Open AI and AI Model gpt-4-1106-preview

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Student_Student_4f0c49de05_Test {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    void testEmptyConstructor() {
        assertNotNull(student, "Student object should not be null");
    }

    @Test
    void testConstructorWithParams() {
        String _id = "12345"; // TODO: Replace with actual _id
        String studentname = "John Doe"; // TODO: Replace with actual student name
        String studentaddress = "123 Main St"; // TODO: Replace with actual address
        String mobile = "555-1234"; // TODO: Replace with actual mobile number

        Student studentWithParams = new Student(_id, studentname, studentaddress, mobile);
        assertNotNull(studentWithParams, "Student object should not be null");

        assertEquals(_id, studentWithParams.get_id(), "ID should match the one provided to the constructor");
        assertEquals(studentname, studentWithParams.getStudentname(), "Student name should match the one provided to the constructor");
        assertEquals(studentaddress, studentWithParams.getStudentaddress(), "Student address should match the one provided to the constructor");
        assertEquals(mobile, studentWithParams.getMobile(), "Mobile should match the one provided to the constructor");
    }
}
