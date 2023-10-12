// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudentController_deleteStudent_163c0d34c8_Test {

    @InjectMocks
    StudentController studentController;

    @Mock
    StudentServices studentServices;

    @Test
    public void testDeleteStudentSuccess() {
        String testId = "123";
        doNothing().when(studentServices).deleteStudent(testId);
        studentController.deleteStudent(testId);
        verify(studentServices, times(1)).deleteStudent(testId);
    }

    @Test
    public void testDeleteStudentFailure() {
        String testId = "123";
        doThrow(new RuntimeException()).when(studentServices).deleteStudent(testId);
        try {
            studentController.deleteStudent(testId);
        } catch (Exception e) {
            verify(studentServices, times(1)).deleteStudent(testId);
        }
    }
}
