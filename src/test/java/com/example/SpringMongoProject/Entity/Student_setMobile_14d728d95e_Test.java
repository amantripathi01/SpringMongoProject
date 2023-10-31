package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Student_setMobile_14d728d95e_Test {

    private Student student = new Student();

    @Test
    public void testSetMobileSuccess() {
        String mobile = "1234567890";
        student.setMobile(mobile);
        assertEquals(mobile, student.getMobile(), "Mobile number should be set successfully");
    }

    @Test
    public void testSetMobileNull() {
        String mobile = null;
        student.setMobile(mobile);
        assertEquals(mobile, student.getMobile(), "Mobile number should be null");
    }

    @Test
    public void testSetMobileEmpty() {
        String mobile = "";
        student.setMobile(mobile);
        assertEquals(mobile, student.getMobile(), "Mobile number should be empty");
    }
}
