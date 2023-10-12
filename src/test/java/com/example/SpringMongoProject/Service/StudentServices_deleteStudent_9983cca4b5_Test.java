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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class StudentServices_deleteStudent_9983cca4b5_Test {

    @Mock
    private StudentRepo repo;

    @InjectMocks
    private StudentServices studentServices;

    @Test
    public void testDeleteStudent_ValidId() {
        String validId = "1234";

        studentServices.deleteStudent(validId);

        verify(repo, times(1)).deleteById(validId);
    }

    @Test
    public void testDeleteStudent_InvalidId() {
        String invalidId = "abcd";

        studentServices.deleteStudent(invalidId);

        verify(repo, times(1)).deleteById(invalidId);
    }
}
