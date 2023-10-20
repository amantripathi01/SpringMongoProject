// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import static org.junit.jupiter.api.Assertions.*;

class Student_Student_4f0c49de05_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testConstructor() {
        assertNotNull(student);
    }

    @Test
    public void testSetAndGetId() {
        String id = "123";
        student.set_id(id);
        assertEquals(id, student.get_id());
    }

    @Test
    public void testSetAndGetStudentname() {
        String name = "John Doe";
        student.setStudentname(name);
        assertEquals(name, student.getStudentname());
    }

    @Test
    public void testSetAndGetStudentaddress() {
        String address = "123 Main St";
        student.setStudentaddress(address);
        assertEquals(address, student.getStudentaddress());
    }

    @Test
    public void testSetAndGetMobile() {
        String mobile = "1234567890";
        student.setMobile(mobile);
        assertEquals(mobile, student.getMobile());
    }
}
