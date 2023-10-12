// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class StudentServices_deleteStudent_9983cca4b5_Test {

    @InjectMocks
    StudentService studentService;

    @Mock
    StudentRepo studentRepo;

    @Test
    public void testDeleteStudentSuccess() {
        String id = "12345"; // TODO: Change this to the actual id
        studentService.deleteStudent(id);
        verify(studentRepo, times(1)).deleteById(id);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteStudentFailure() {
        String id = null; 
        studentService.deleteStudent(id);
        verify(studentRepo, times(1)).deleteById(id);
    }

}
