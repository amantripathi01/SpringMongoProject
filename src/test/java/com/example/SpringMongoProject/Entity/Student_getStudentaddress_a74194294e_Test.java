// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Student_getStudentaddress_a74194294e_Test {
    
    @Test
    public void testGetStudentaddress() {
        Student student = new Student();
        student.setStudentaddress("123 Main St");
        assertEquals("123 Main St", student.getStudentaddress());
    }

    @Test
    public void testGetStudentaddress_Empty() {
        Student student = new Student();
        student.setStudentaddress("");
        assertEquals("", student.getStudentaddress());
    }
}
