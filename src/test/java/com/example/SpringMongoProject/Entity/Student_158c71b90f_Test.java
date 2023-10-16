// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.SpringMongoProject.Entity.Student;

@SpringBootTest
public class Student_158c71b90f_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("1", "John Doe", "123 Street", "1234567890");
    }

    @Test
    public void testStudentId() {
        assertEquals("1", student.get_id(), "Student Id should be 1");
    }

    @Test
    public void testStudentName() {
        assertEquals("John Doe", student.getStudentname(), "Student's name should be John Doe");
    }

    @Test
    public void testStudentAddress() {
        assertEquals("123 Street", student.getStudentaddress(), "Student's address should be 123 Street");
    }

    @Test
    public void testStudentMobile() {
        assertEquals("1234567890", student.getMobile(), "Student's mobile number should be 1234567890");
    }
}
