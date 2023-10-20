// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_get_id_c3fa75ed0b_Test {

    @InjectMocks
    private Student student;

    @Mock
    private String _id;

    @Test
    public void testGetIdSuccess() {
        String expectedId = "12345";
        _id = expectedId;
        String actualId = student.get_id();
        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    public void testGetIdFailure() {
        String unexpectedId = "67890";
        _id = "12345";
        String actualId = student.get_id();
        Assertions.assertNotEquals(unexpectedId, actualId);
    }
}
