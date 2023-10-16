// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@SpringBootTest
public class Student_setStudentaddress_ae77a1b84a_Test {

    @Autowired
    private Student student;

    @MockBean
    private SomeExternalService someExternalService;

    @Test
    public void testSetStudentAddress_Success() {
        String expectedAddress = "123 Main St";
        doNothing().when(someExternalService).someMethod();
        student.setStudentaddress(expectedAddress);
        assertEquals(expectedAddress, student.getStudentaddress());
    }

    @Test
    public void testSetStudentAddress_Null() {
        String expectedAddress = null;
        doNothing().when(someExternalService).someMethod();
        student.setStudentaddress(expectedAddress);
        assertEquals(expectedAddress, student.getStudentaddress());
    }
}
