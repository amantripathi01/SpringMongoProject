// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Repo.StudentRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class StudentServices_getStudentByID_59fd5b1864_Test {

    @Mock
    private StudentRepo repo;

    private StudentServices studentServices;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        studentServices = new StudentServices();
    }

    @Test
    public void testGetStudentByID_Success() {
        Student student = new Student();
        student.set_id("1");
        student.setStudentname("John");
        student.setStudentaddress("123 Street");
        student.setMobile("1234567890");

        when(repo.findById("1")).thenReturn(Optional.of(student));

        Student result = studentServices.getStudentByID("1");

        assertEquals("1", result.get_id());
        assertEquals("John", result.getStudentname());
        assertEquals("123 Street", result.getStudentaddress());
        assertEquals("1234567890", result.getMobile());
    }

    @Test
    public void testGetStudentByID_NotFound() {
        when(repo.findById("2")).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> studentServices.getStudentByID("2"));
    }
}
