// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_set_id_b8adefff49_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSet_id_withValidId() {
        String id = "12345";
        student.set_id(id);
        Assertions.assertEquals(id, student.get_id());
    }

    @Test
    public void testSet_id_withNullId() {
        String id = null;
        student.set_id(id);
        Assertions.assertNull(student.get_id());
    }
}
