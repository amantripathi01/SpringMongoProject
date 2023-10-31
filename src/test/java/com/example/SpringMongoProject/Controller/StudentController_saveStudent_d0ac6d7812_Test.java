package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentController_saveStudent_d0ac6d7812_Test {

    @Mock
    private StudentServices studentServices;

    @InjectMocks
    private StudentController studentController;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void saveStudentTest() {
        Student student = new Student();
        student.set_id("1");
        
        studentController.saveStudent(student);
        
        verify(studentServices, times(1)).saveorUpdate(student);
    }

    @Test
    public void saveStudentNullTest() {
        Student student = new Student();
        
        studentController.saveStudent(student);
        
        verify(studentServices, times(1)).saveorUpdate(student);
    }
}
