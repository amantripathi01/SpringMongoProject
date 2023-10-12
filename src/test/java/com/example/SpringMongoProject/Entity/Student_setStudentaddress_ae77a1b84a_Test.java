// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class Student_setStudentaddress_ae77a1b84a_Test {

    @Autowired
    Student student;

    @Test
    public void testSetStudentAddress() {
        String address = "123 Main St";
        student.setStudentaddress(address);
        assertEquals("123 Main St", student.getStudentaddress());
    }

    @Test
    public void testSetNullStudentAddress() {
        student.setStudentaddress(null);
        assertNull(student.getStudentaddress());
    }
}