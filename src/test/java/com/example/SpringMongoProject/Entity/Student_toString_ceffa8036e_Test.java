// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Student_toString_ceffa8036e_Test {

    @Mock
    private Student student;

    @BeforeEach
    public void setup() {
        student = new Student();
        student.set_id("1");
        student.setStudentname("John Doe");
        student.setStudentaddress("123 Main St");
        student.setMobile("1234567890");
    }

    @Test
    public void testToString_AllFields() {
        String expected = "Student{" +
                "_id='1'" +
                ", studentname='John Doe'" +
                ", studentaddress='123 Main St'" +
                ", mobile='1234567890'" +
                '}';
        assertEquals(expected, student.toString());
    }

    @Test
    public void testToString_NullFields() {
        student.set_id(null);
        student.setStudentname(null);
        student.setStudentaddress(null);
        student.setMobile(null);
        
        String expected = "Student{" +
                "_id='null'" +
                ", studentname='null'" +
                ", studentaddress='null'" +
                ", mobile='null'" +
                '}';
        assertEquals(expected, student.toString());
    }
}
