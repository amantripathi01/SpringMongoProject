// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudentServices_deleteStudent_9983cca4b5_Test {

    @Mock
    private StudentRepo repo;

    @InjectMocks
    private StudentService studentService;

    @Test
    public void testDeleteStudent_Success() {
        String id = "1234";
        doNothing().when(repo).deleteById(id);
        studentService.deleteStudent(id);
        verify(repo, times(1)).deleteById(id);
    }

    @Test
    public void testDeleteStudent_Failure() {
        String id = "1234";
        doThrow(new IllegalArgumentException()).when(repo).deleteById(id);
        try {
            studentService.deleteStudent(id);
        } catch (IllegalArgumentException e) {
            verify(repo, times(1)).deleteById(id);
        }
    }
}
