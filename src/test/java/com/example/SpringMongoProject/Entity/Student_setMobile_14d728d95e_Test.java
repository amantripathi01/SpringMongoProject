/*
Test generated by RoostGPT for test aman321 using AI Type Vertex AI and AI Model text-bison

 **Test Scenario 1: Valid Mobile Number**

**Description**: This test scenario verifies that the `setMobile()` method successfully sets a valid mobile number for a user.

**Test Steps**:

1. Create a new user object with a valid mobile number (e.g., "+919876543210").
2. Call the `setMobile()` method on the user object with the valid mobile number.
3. Assert that the mobile number of the user object is set correctly to the valid mobile number.

**Expected Outcome**: The `setMobile()` method should successfully set the mobile number of the user object to the valid mobile number.

---

**Test Scenario 2: Invalid Mobile Number**

**Description**: This test scenario verifies that the `setMobile()` method does not set an invalid mobile number for a user.

**Test Steps**:

1. Create a new user object with an invalid mobile number (e.g., "1234567890").
2. Call the `setMobile()` method on the user object with the invalid mobile number.
3. Assert that the mobile number of the user object is not set to the invalid mobile number.

**Expected Outcome**: The `setMobile()` method should not set the mobile number of the user object to the invalid mobile number.

---

**Test Scenario 3: Null Mobile Number**

**Description**: This test scenario verifies that the `setMobile()` method does not set a null value for the mobile number of a user.

**Test Steps**:

1. Create a new user object with a null mobile number.
2. Call the `setMobile()` method on the user object with the null mobile number.
3. Assert that the mobile number of the user object is not set to null.

**Expected Outcome**: The `setMobile()` method should not set the mobile number of the user object to null.
*/
package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class Student_setMobile_14d728d95e_Test {

    @Test
    void setMobile_validMobileNumber() {
        // Arrange
        Student student = new Student("1", "John Doe", "123 Main Street", null);

        // Act
        student.setMobile("+919876543210");

        // Assert
        assertEquals("+919876543210", student.getMobile());
    }

    @Test
    void setMobile_invalidMobileNumber() {
        // Arrange
        Student student = new Student("1", "John Doe", "123 Main Street", null);

        // Act
        student.setMobile("1234567890");

        // Assert
        assertNotEquals("1234567890", student.getMobile());
    }

    @Test
    void setMobile_nullMobileNumber() {
        // Arrange
        Student student = new Student("1", "John Doe", "123 Main Street", null);

        // Act
        student.setMobile(null);

        // Assert
        assertNotNull(student.getMobile());
    }
}
