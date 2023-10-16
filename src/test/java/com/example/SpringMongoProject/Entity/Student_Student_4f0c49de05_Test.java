// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class Student_Student_4f0c49de05_Test {

    private Student student;

    @BeforeEach
    public void setup() {
        student = new Student();
    }

    @Test
    public void testStudentConstructor() {
        assertNotNull(student);
    }

    @Test
    public void testStudentFields() {
        student.setId("123");
        student.setName("John Doe");
        student.setAge(20);
        student.setDepartment("Computer Science");

        assertEquals("123", student.getId());
        assertEquals("John Doe", student.getName());
        assertEquals(20, student.getAge());
        assertEquals("Computer Science", student.getDepartment());
    }
}
