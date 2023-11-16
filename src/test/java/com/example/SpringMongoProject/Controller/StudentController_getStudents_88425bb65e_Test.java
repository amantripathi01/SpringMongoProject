// Test generated by RoostGPT for test gitlab using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudentController_getStudents_88425bb65e_Test {

    @Mock
    private StudentServices studentServices;

    @InjectMocks
    private StudentController studentController;

    @BeforeEach
    void setMockOutput() {
        when(studentServices.getStudentByID("123")).thenReturn(new Student("123", "John Doe", 22));
    }

    @Test
    public void testGetStudents() {
        String studentId = "123";
        Student result = studentController.getStudents(studentId);
        assertNotNull(result);
        assertEquals("123", result.get_id());
        assertEquals("John Doe", result.getName());
        assertEquals(22, result.getAge());
    }

    @Test
    public void testGetStudents_NullId() {
        String studentId = null;
        assertThrows(NullPointerException.class, () -> {
            studentController.getStudents(studentId);
        });
    }
}
