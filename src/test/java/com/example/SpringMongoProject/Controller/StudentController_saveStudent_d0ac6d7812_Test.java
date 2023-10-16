// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class StudentController_saveStudent_d0ac6d7812_Test {

    @InjectMocks
    StudentController studentController;

    @Mock
    StudentServices studentServices;

    @Test
    public void testSaveStudent_Success() {
        Student student = new Student();
        student.set_id("123");
        student.setStudentName("Test");
        student.setStudentAddress("Test Address");
        student.setMobile("1234567890");

        when(studentServices.saveorUpdate(student)).thenReturn(student);

        String result = studentController.saveStudent(student);

        assertEquals("123", result);
        verify(studentServices, times(1)).saveorUpdate(student);
    }

    @Test
    public void testSaveStudent_Failure() {
        Student student = new Student();
        student.set_id("123");
        student.setStudentName("Test");
        student.setStudentAddress("Test Address");
        student.setMobile("1234567890");

        when(studentServices.saveorUpdate(student)).thenReturn(null);

        String result = studentController.saveStudent(student);

        assertEquals(null, result);
        verify(studentServices, times(1)).saveorUpdate(student);
    }
}
