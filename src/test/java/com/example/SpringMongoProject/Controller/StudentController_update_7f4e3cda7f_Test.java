package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StudentController_update_7f4e3cda7f_Test {

    @InjectMocks
    private StudentController studentController;

    @Mock
    private StudentServices studentServices;

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
        student.set_id("1");
        student.setStudentname("John Doe");
        student.setStudentaddress("123 Main St");
        student.setMobile("1234567890");
    }

    @Test
    public void testUpdateStudent() {
        doAnswer(invocation -> {
            Student arg = invocation.getArgument(0);
            arg.set_id("1");
            return null;
        }).when(studentServices).saveorUpdate(any(Student.class));

        Student updatedStudent = studentController.update(student, "1");

        verify(studentServices, times(1)).saveorUpdate(any(Student.class));
        assertEquals("1", updatedStudent.get_id());
    }

    @Test
    public void testUpdateStudentWithDifferentId() {
        doAnswer(invocation -> {
            Student arg = invocation.getArgument(0);
            arg.set_id("2");
            return null;
        }).when(studentServices).saveorUpdate(any(Student.class));

        Student updatedStudent = studentController.update(student, "2");

        verify(studentServices, times(1)).saveorUpdate(any(Student.class));
        assertEquals("2", updatedStudent.get_id());
    }
}
