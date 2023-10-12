// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_get_id_c3fa75ed0b_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testGetId_Success() {
        String expectedId = "12345";
        student.set_id(expectedId);
        String actualId = student.get_id();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID.");
    }

    @Test
    public void testGetId_Failure() {
        String unexpectedId = "54321";
        student.set_id("12345");
        String actualId = student.get_id();
        assertNotEquals(unexpectedId, actualId, "The unexpected ID should not match the actual ID.");
    }
}
