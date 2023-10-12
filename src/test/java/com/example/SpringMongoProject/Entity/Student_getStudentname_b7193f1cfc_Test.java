// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class Student_getStudentname_b7193f1cfc_Test {

    @Autowired
    private StudentService studentService;

    @MockBean
    private StudentRepository studentRepository;

    @Test
    public void testGetStudentname_Success() {
        Student student = new Student();
        student.setStudentname("John Doe");
        when(studentRepository.findById(student.getId())).thenReturn(Optional.of(student));

        String returnedName = studentService.getStudentname(student.getId());
        assertEquals("John Doe", returnedName);
    }

    @Test
    public void testGetStudentname_Failure() {
        when(studentRepository.findById(anyString())).thenReturn(Optional.empty());

        String returnedName = studentService.getStudentname("invalid_id");
        assertEquals(null, returnedName);
    }
}
