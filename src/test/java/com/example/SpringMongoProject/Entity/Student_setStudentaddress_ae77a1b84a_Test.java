// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
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
