// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Repo.StudentRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class StudentServices_saveorUpdate_c0d5e798a5_Test {

    @InjectMocks
    StudentServices studentServices;

    @Mock
    StudentRepo studentRepo;

    @Test
    public void testSaveOrUpdate_Success() {
        Student student = new Student();
        student.set_id("1");
        student.setStudentname("John Doe");
        student.setStudentaddress("123 ABC Street");
        student.setMobile("1234567890");

        studentServices.saveorUpdate(student);

        verify(studentRepo, times(1)).save(student);
    }

    @Test
    public void testSaveOrUpdate_Failure() {
        Student student = null;

        studentServices.saveorUpdate(student);

        verify(studentRepo, times(0)).save(student);
    }
}
