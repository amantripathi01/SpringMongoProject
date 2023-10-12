// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Student_158c71b90f_Test {

    @Autowired
    private Student student;

    @MockBean
    private StudentRepository studentRepository;

    @BeforeEach
    public void setUp() {
        student = new Student("1", "John Doe", "123 Street", "1234567890");
    }

    @Test
    public void testStudentId() {
        assertEquals("1", student.get_id());
    }

    @Test
    public void testStudentName() {
        assertEquals("John Doe", student.getStudentname());
    }

    @Test
    public void testStudentAddress() {
        assertEquals("123 Street", student.getStudentaddress());
    }

    @Test
    public void testStudentMobile() {
        assertEquals("1234567890", student.getMobile());
    }

}
