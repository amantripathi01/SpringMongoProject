// Test generated by RoostGPT for test gitlab using AI Type Open AI and AI Model gpt-4-1106-preview

package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentController_getStudents_23978b7130_Test {

    @InjectMocks
    private StudentController studentController;

    @Mock
    private StudentServices studentServices;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetStudents_success() {
        // Arrange
        Student student1 = new Student(); // TODO: Set properties as needed
        Student student2 = new Student(); // TODO: Set properties as needed
        List<Student> expectedStudents = Arrays.asList(student1, student2);
        when(studentServices.listAll()).thenReturn(expectedStudents);

        // Act
        Iterable<Student> actualStudents = studentController.getStudents();

        // Assert
        assertNotNull(actualStudents);
        assertIterableEquals(expectedStudents, actualStudents);
    }

    @Test
    public void testGetStudents_emptyList() {
        // Arrange
        List<Student> expectedStudents = Arrays.asList();
        when(studentServices.listAll()).thenReturn(expectedStudents);

        // Act
        Iterable<Student> actualStudents = studentController.getStudents();

        // Assert
        assertNotNull(actualStudents);
        assertTrue(!actualStudents.iterator().hasNext());
    }
}
