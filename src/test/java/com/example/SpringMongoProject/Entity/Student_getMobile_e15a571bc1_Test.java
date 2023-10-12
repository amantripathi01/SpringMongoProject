// Test generated by RoostGPT for test springMongoDB using AI Type Open AI and AI Model gpt-4

package com.example.SpringMongoProject.Entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Student_getMobile_e15a571bc1_Test {

  @Test
  public void testGetMobileSuccess() {
    Student student = new Student();
    student.setMobile("1234567890");
    String expected = "1234567890";
    String actual = student.getMobile();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetMobileFailure() {
    Student student = new Student();
    student.setMobile("0987654321");
    String unexpected = "1234567890";
    String actual = student.getMobile();
    assertNotEquals(unexpected, actual);
  }
}
