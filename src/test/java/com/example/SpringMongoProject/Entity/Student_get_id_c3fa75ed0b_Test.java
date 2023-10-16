// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_get_id_c3fa75ed0b_Test {

    @Test
    public void testGetIdSuccess() {
        Student student = new Student();
        student.set_id("12345");
        Assertions.assertEquals("12345", student.get_id());
    }

    @Test
    public void testGetIdFailure() {
        Student student = new Student();
        student.set_id("12345");
        Assertions.assertNotEquals("54321", student.get_id());
    }
}
