// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentController_update_44931af386_Test {

    @InjectMocks
    StudentController studentController;

    @Mock
    StudentServices studentServices;

    @Autowired
    Student student;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUpdateStudentSuccess() {
        String _id = "123";
        student.set_id(_id);
        student.setStudentname("John Doe");
        student.setStudentaddress("123 Street");
        student.setMobile("1234567890");

        when(studentServices.saveorUpdate(student)).thenReturn(student);

        Student updatedStudent = studentController.update(student, _id);

        verify(studentServices, times(1)).saveorUpdate(student);
        assertEquals(_id, updatedStudent.get_id());
    }

    @Test
    public void testUpdateStudentFailure() {
        String _id = "123";
        student.set_id(_id);
        student.setStudentname("John Doe");
        student.setStudentaddress("123 Street");
        student.setMobile("1234567890");

        when(studentServices.saveorUpdate(student)).thenReturn(null);

        Student updatedStudent = studentController.update(student, _id);

        verify(studentServices, times(1)).saveorUpdate(student);
        assertEquals(null, updatedStudent);
    }
}