// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Repo.StudentRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class StudentServices_listAll_720f08e71b_Test {

    @InjectMocks
    private StudentServices studentServices;

    @Mock
    private StudentRepo studentRepo;

    @Test
    public void testListAll() {
        Student student1 = new Student("1", "John", "New York", "1234567890");
        Student student2 = new Student("2", "Jane", "Los Angeles", "0987654321");
        List<Student> expectedStudents = Arrays.asList(student1, student2);

        when(studentRepo.findAll()).thenReturn(expectedStudents);

        Iterable<Student> actualStudents = studentServices.listAll();

        assertEquals(expectedStudents, actualStudents);
    }

    @Test
    public void testListAll_Empty() {
        List<Student> expectedStudents = Arrays.asList();

        when(studentRepo.findAll()).thenReturn(expectedStudents);

        Iterable<Student> actualStudents = studentServices.listAll();

        assertEquals(expectedStudents, actualStudents);
    }
}
