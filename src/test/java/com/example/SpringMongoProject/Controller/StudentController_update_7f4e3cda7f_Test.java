// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class StudentController_update_7f4e3cda7f_Test {

    @InjectMocks
    StudentController studentController;

    @Mock
    StudentServices studentServices;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student();
        student.set_id("123");
        student.setStudentname("John Doe");
        student.setStudentaddress("123 Main St");
        student.setMobile("1234567890");

        when(studentServices.saveorUpdate(any(Student.class))).thenReturn(student);

        Student result = studentController.update(student, "123");

        verify(studentServices, times(1)).saveorUpdate(student);
        assertEquals("123", result.get_id());
        assertEquals("John Doe", result.getStudentname());
        assertEquals("123 Main St", result.getStudentaddress());
        assertEquals("1234567890", result.getMobile());
    }

    @Test
    public void testUpdateStudentNull() {
        Student student = new Student();

        when(studentServices.saveorUpdate(any(Student.class))).thenReturn(null);

        Student result = studentController.update(student, "123");

        verify(studentServices, times(1)).saveorUpdate(student);
        assertEquals(null, result);
    }
}
