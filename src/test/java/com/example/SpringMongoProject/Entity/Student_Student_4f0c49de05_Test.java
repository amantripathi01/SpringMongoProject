package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Student_Student_4f0c49de05_Test {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testStudentConstructor() {
        Assertions.assertNotNull(student, "Student object should not be null");
    }
    
    @Test
    public void testSetAndGetId() {
        String id = "123";
        student.set_id(id);
        Assertions.assertEquals(id, student.get_id(), "ID should be same as set");
    }

    @Test
    public void testSetAndGetName() {
        String name = "John Doe";
        student.setStudentname(name);
        Assertions.assertEquals(name, student.getStudentname(), "Name should be same as set");
    }

    @Test
    public void testSetAndGetAddress() {
        String address = "123 Street, City";
        student.setStudentaddress(address);
        Assertions.assertEquals(address, student.getStudentaddress(), "Address should be same as set");
    }

    @Test
    public void testSetAndGetMobile() {
        String mobile = "1234567890";
        student.setMobile(mobile);
        Assertions.assertEquals(mobile, student.getMobile(), "Mobile should be same as set");
    }
}
