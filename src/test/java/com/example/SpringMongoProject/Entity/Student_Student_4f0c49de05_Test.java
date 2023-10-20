// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Student_Student_4f0c49de05_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testEmptyConstructor() {
        assertNotNull(student, "Student object is null after instantiation");
    }

    @Test
    public void testSettersAndGetters() {
        String id = "123";
        String name = "John Doe";
        String address = "123 Main St";
        String mobile = "1234567890";

        student.set_id(id);
        student.setStudentname(name);
        student.setStudentaddress(address);
        student.setMobile(mobile);

        assertEquals(id, student.get_id(), "Student ID not set correctly");
        assertEquals(name, student.getStudentname(), "Student name not set correctly");
        assertEquals(address, student.getStudentaddress(), "Student address not set correctly");
        assertEquals(mobile, student.getMobile(), "Student mobile not set correctly");
    }
}
