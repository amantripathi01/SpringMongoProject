// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Repo.StudentRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.any;

public class StudentServices_saveorUpdate_c0d5e798a5_Test {
    @InjectMocks
    StudentServices studentServices;

    @Mock
    StudentRepo repo;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveOrUpdate() {
        Student student = new Student();
        studentServices.saveorUpdate(student);
        verify(repo, times(1)).save(student);
    }

    @Test
    public void testSaveOrUpdate_NullStudent() {
        try {
            studentServices.saveorUpdate(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Student object cannot be null", e.getMessage());
        }
    }
}
