// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class StudentController_getStudents_88425bb65e_Test {

    @InjectMocks
    StudentController studentController;

    @Mock
    StudentServices studentServices;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetStudents_validId() {
        String studentId = "123";
        Student student = new Student();
        student.set_id(studentId);
        when(studentServices.getStudentByID(any(String.class))).thenReturn(student);

        Student result = studentController.getStudents(studentId);

        verify(studentServices, times(1)).getStudentByID(studentId);
        assertEquals(studentId, result.get_id());
    }

    @Test
    public void testGetStudents_invalidId() {
        String studentId = "123";
        when(studentServices.getStudentByID(any(String.class))).thenReturn(null);

        Student result = studentController.getStudents(studentId);

        verify(studentServices, times(1)).getStudentByID(studentId);
        assertEquals(null, result);
    }
}
