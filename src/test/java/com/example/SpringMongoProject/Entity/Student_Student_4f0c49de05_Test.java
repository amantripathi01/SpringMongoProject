/*
Test generated by RoostGPT for test aman321 using AI Type Vertex AI and AI Model text-bison

 **Test Scenario 1: Create a new student**

* **Given:** A new student object with valid data
* **When:** The `createStudent` method is called with the new student object
* **Then:** The student is saved to the database and a unique ID is generated

**Test Scenario 2: Get a student by ID**

* **Given:** A valid student ID
* **When:** The `getStudentById` method is called with the student ID
* **Then:** The student with the given ID is retrieved from the database

**Test Scenario 3: Update a student**

* **Given:** A student object with updated data
* **When:** The `updateStudent` method is called with the updated student object
* **Then:** The student is updated in the database with the new data

**Test Scenario 4: Delete a student**

* **Given:** A valid student ID
* **When:** The `deleteStudent` method is called with the student ID
* **Then:** The student with the given ID is deleted from the database

**Test Scenario 5: Get all students**

* **Given:** A database with multiple students
* **When:** The `getAllStudents` method is called
* **Then:** A list of all students in the database is returned
*/
package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Student_Student_4f0c49de05_Test {

    @Autowired
    private Student student;

    @Test
    public void testConstructorWithArguments() {
        // Given
        String _id = "12345";
        String studentname = "John Doe";
        String studentaddress = "123 Main Street";
        String mobile = "0123456789";

        // When
        Student student = new Student(_id, studentname, studentaddress, mobile);

        // Then
        Assertions.assertEquals(_id, student.get_id());
        Assertions.assertEquals(studentname, student.getStudentname());
        Assertions.assertEquals(studentaddress, student.getStudentaddress());
        Assertions.assertEquals(mobile, student.getMobile());
    }

    @Test
    public void testConstructorWithoutArguments() {
        // When
        Student student = new Student();

        // Then
        Assertions.assertNull(student.get_id());
        Assertions.assertNull(student.getStudentname());
        Assertions.assertNull(student.getStudentaddress());
        Assertions.assertNull(student.getMobile());
    }
}
