// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class StudentController_deleteStudent_6bbb74f202_Test {

    @Autowired
    private StudentController studentController;

    @MockBean
    private StudentServices studentServices;

    @Test
    public void testDeleteStudentSuccess() {
        String studentId = "1";
        doNothing().when(studentServices).deleteStudent(studentId);
        studentController.deleteStudent(studentId);
        verify(studentServices, times(1)).deleteStudent(studentId);
    }

    @Test
    public void testDeleteStudentFailure() {
        String studentId = "1";
        doThrow(new RuntimeException()).when(studentServices).deleteStudent(studentId);
        assertThrows(RuntimeException.class, () -> studentController.deleteStudent(studentId));
        verify(studentServices, times(1)).deleteStudent(studentId);
    }
}
