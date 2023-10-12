// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Student_setStudentaddress_ae77a1b84a_Test {

    @Mock
    private Student student;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        student = new Student();
    }

    @Test
    public void testSetStudentAddress_ValidAddress() {
        String validAddress = "123 Main St";
        student.setStudentaddress(validAddress);
        assertEquals(validAddress, student.getStudentaddress());
    }

    @Test
    public void testSetStudentAddress_EmptyAddress() {
        String emptyAddress = "";
        student.setStudentaddress(emptyAddress);
        assertEquals(emptyAddress, student.getStudentaddress());
    }
}
