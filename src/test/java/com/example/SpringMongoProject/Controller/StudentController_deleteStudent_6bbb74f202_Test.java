// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentController_deleteStudent_6bbb74f202_Test {

    @Autowired
    private StudentController studentController;

    @MockBean
    private StudentServices studentServices;

    @BeforeEach
    public void setUp() {
        Student student = new Student();
        student.set_id("123");
        student.setStudentName("John Doe");
        student.setStudentAddress("123 Main St");
        student.setMobile("1234567890");

        Mockito.when(studentServices.getStudentByID(student.get_id()))
                .thenReturn(student);
    }

    @Test
    public void testDeleteStudent_Success() {
        String id = "123";
        studentController.deleteStudent(id);

        Mockito.verify(studentServices, Mockito.times(1)).deleteStudent(id);
    }

    @Test
    public void testDeleteStudent_Failure() {
        String id = "456";
        studentController.deleteStudent(id);

        Mockito.verify(studentServices, Mockito.times(1)).deleteStudent(id);
    }
}
