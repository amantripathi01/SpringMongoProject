// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Student_get_id_c3fa75ed0b_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testGetIdWhenIdIsNotNull() {
        String id = "123";
        student.set_id(id);
        String actualId = student.get_id();
        Assertions.assertNotNull(actualId, "Expected id not to be null");
        Assertions.assertEquals(id, actualId, "Expected id to match the set id");
    }

    @Test
    public void testGetIdWhenIdIsNull() {
        student.set_id(null);
        String actualId = student.get_id();
        Assertions.assertNull(actualId, "Expected id to be null");
    }
}
