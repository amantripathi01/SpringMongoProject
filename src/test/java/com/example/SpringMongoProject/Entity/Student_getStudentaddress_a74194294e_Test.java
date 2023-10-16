// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_getStudentaddress_a74194294e_Test {

    @InjectMocks
    private Student student;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetStudentAddress_Success() {
        student.setStudentaddress("123 Test Street");
        String expectedAddress = "123 Test Street";
        assertEquals(expectedAddress, student.getStudentaddress());
    }

    @Test
    public void testGetStudentAddress_Failure() {
        student.setStudentaddress("123 Test Street");
        String unexpectedAddress = "456 Test Avenue";
        assertEquals(unexpectedAddress, student.getStudentaddress());
    }
}
