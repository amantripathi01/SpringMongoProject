// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Student_getStudentname_b7193f1cfc_Test {
    
    @InjectMocks
    private Student student;

    @Test
    public void testGetStudentname() {
        String expectedStudentName = "John Doe";
        student.setStudentname(expectedStudentName);
        String actualStudentName = student.getStudentname();
        assertEquals(expectedStudentName, actualStudentName);
    }

    @Test
    public void testGetStudentnameWithNoName() {
        String expectedStudentName = "";
        student.setStudentname(expectedStudentName);
        String actualStudentName = student.getStudentname();
        assertEquals(expectedStudentName, actualStudentName);
    }
}
