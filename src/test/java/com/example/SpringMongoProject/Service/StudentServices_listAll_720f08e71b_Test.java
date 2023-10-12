// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class StudentServices_listAll_720f08e71b_Test {

    @InjectMocks
    private StudentServices studentServices;

    @Mock
    private StudentRepo repo;

    @BeforeEach
    void setMockOutput() {
        when(repo.findAll()).thenReturn(Arrays.asList(new Student(), new Student()));
    }

    @Test
    public void testListAll() {
        List<Student> students = (List<Student>) studentServices.listAll();
        assertEquals(2, students.size());
        verify(repo, times(1)).findAll();
    }

    @Test
    public void testListAllWhenNoData() {
        when(repo.findAll()).thenReturn(Arrays.asList());
        List<Student> students = (List<Student>) studentServices.listAll();
        assertEquals(0, students.size());
        verify(repo, times(1)).findAll();
    }
}
