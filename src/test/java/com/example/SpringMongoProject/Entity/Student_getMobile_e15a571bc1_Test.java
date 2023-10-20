// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Student_getMobile_e15a571bc1_Test {

    @Test
    public void testGetMobileSuccess() {
        // mock Student object
        Student studentMock = Mockito.mock(Student.class);
        Mockito.when(studentMock.getMobile()).thenReturn("1234567890");

        String expectedMobile = "1234567890";
        String actualMobile = studentMock.getMobile();

        Assertions.assertEquals(expectedMobile, actualMobile);
    }

    @Test
    public void testGetMobileNull() {
        // mock Student object
        Student studentMock = Mockito.mock(Student.class);
        Mockito.when(studentMock.getMobile()).thenReturn(null);

        String expectedMobile = null;
        String actualMobile = studentMock.getMobile();

        Assertions.assertEquals(expectedMobile, actualMobile);
    }
}
