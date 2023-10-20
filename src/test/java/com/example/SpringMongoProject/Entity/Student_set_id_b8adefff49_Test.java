// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.security.Provider.Service;

@SpringBootTest
public class Student_set_id_b8adefff49_Test {

    @Autowired
    private Student student;

    @MockBean
    private Service studentService;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testSet_id_ValidId() {
        String validId = "12345";
        student.set_id(validId);
        assertEquals(validId, student.get_id());
    }

    @Test
    public void testSet_id_NullId() {
        String nullId = null;
        student.set_id(nullId);
        assertEquals(nullId, student.get_id());
    }
}
