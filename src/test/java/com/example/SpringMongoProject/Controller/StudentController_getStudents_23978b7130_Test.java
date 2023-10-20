// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class StudentController_getStudents_23978b7130_Test {

    @InjectMocks
    StudentController studentController;

    @Mock
    StudentServices studentServices;

    @Test
    public void testGetStudents() {
        Student student1 = new Student();
        student1.set_id("1");
        student1.setStudentname("John");
        student1.setStudentaddress("123 Street");
        student1.setMobile("1234567890");

        Student student2 = new Student();
        student2.set_id("2");
        student2.setStudentname("Jane");
        student2.setStudentaddress("456 Avenue");
        student2.setMobile("0987654321");

        List<Student> students = Arrays.asList(student1, student2);

        when(studentServices.listAll()).thenReturn(students);
        Iterable<Student> result = studentController.getStudents();

        assertEquals(students, result);
    }

    @Test
    public void testGetStudentsEmpty() {
        List<Student> students = Arrays.asList();
        when(studentServices.listAll()).thenReturn(students);
        Iterable<Student> result = studentController.getStudents();

        assertEquals(students, result);
    }
}
