// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class Student_setMobile_14d728d95e_Test {

    @Test
    public void testSetMobile() {
        Student student = new Student();
        student.setMobile("1234567890");
        assertEquals("1234567890", student.getMobile());
    }

    @Test
    public void testSetMobileWithNull() {
        Student student = new Student();
        student.setMobile(null);
        assertEquals(null, student.getMobile());
    }
}
