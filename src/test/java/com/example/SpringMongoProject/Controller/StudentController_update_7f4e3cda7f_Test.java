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

class StudentController_update_7f4e3cda7f_Test {

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
        student.setStudentName("John Doe");
        student.setStudentAddress("123 Street");
        student.setMobile("123456789");

        when(studentServices.saveorUpdate(student)).thenReturn(student);

        Student result = studentController.update(student, "123");
        assertEquals("123", result.get_id());
        assertEquals("John Doe", result.getStudentName());
        assertEquals("123 Street", result.getStudentAddress());
        assertEquals("123456789", result.getMobile());

        verify(studentServices, times(1)).saveorUpdate(student);
    }

    @Test
    public void testUpdateStudentFailure() {
        Student student = new Student();
        student.set_id("123");
        student.setStudentName("John Doe");
        student.setStudentAddress("123 Street");
        student.setMobile("123456789");

        when(studentServices.saveorUpdate(student)).thenReturn(null);

        Student result = studentController.update(student, "123");
        assertEquals(null, result);

        verify(studentServices, times(1)).saveorUpdate(student);
    }
}
